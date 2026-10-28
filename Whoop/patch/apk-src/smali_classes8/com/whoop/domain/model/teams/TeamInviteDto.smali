.class public final Lcom/whoop/domain/model/teams/TeamInviteDto;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/domain/model/teams/TeamInviteDto$$serializer;,
        Lcom/whoop/domain/model/teams/TeamInviteDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\u0008\u0087\u0008\u0018\u0000 N2\u00020\u0001:\u0002ONBe\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0011\u0010\u0012Bs\u0008\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0011\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001bJ\u0012\u0010#\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\u001fJz\u0010)\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\u00022\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010\u001dJ\u0010\u0010,\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010\u001bJ\u001a\u0010/\u001a\u00020\u00062\u0008\u0010.\u001a\u0004\u0018\u00010-H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100J\'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001\u00a2\u0006\u0004\u00087\u00108R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010:\u001a\u0004\u0008;\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010<\u001a\u0004\u0008=\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010>\u001a\u0004\u0008?\u0010\u001fR\u001a\u0010\u0008\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010:\u001a\u0004\u0008@\u0010\u001bR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010:\u001a\u0004\u0008A\u0010\u001bR\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010:\u001a\u0004\u0008B\u0010\u001bR\u001c\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010C\u001a\u0004\u0008D\u0010$R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010E\u001a\u0004\u0008F\u0010&R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010<\u0012\u0004\u0008H\u0010I\u001a\u0004\u0008G\u0010\u001dR(\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0010\u0010>\u0012\u0004\u0008M\u0010I\u001a\u0004\u0008J\u0010\u001f\"\u0004\u0008K\u0010L\u00a8\u0006P"
    }
    d2 = {
        "Lcom/whoop/domain/model/teams/TeamInviteDto;",
        "Ljava/io/Serializable;",
        "",
        "id",
        "",
        "status",
        "",
        "deleted",
        "communityId",
        "senderId",
        "recipientId",
        "Lcom/whoop/domain/model/teams/CommunityDto;",
        "community",
        "Lcom/whoop/domain/model/teams/CommunityMemberDto;",
        "sender",
        "inviteCode",
        "showBadge",
        "<init>",
        "(ILjava/lang/String;ZIIILcom/whoop/domain/model/teams/CommunityDto;Lcom/whoop/domain/model/teams/CommunityMemberDto;Ljava/lang/String;Z)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IILjava/lang/String;ZIIILcom/whoop/domain/model/teams/CommunityDto;Lcom/whoop/domain/model/teams/CommunityMemberDto;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "Lcom/whoop/domain/model/teams/DrawerDisplayInvite;",
        "toDrawerDisplayInvite",
        "()Lcom/whoop/domain/model/teams/DrawerDisplayInvite;",
        "component1",
        "()I",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "()Z",
        "component4",
        "component5",
        "component6",
        "component7",
        "()Lcom/whoop/domain/model/teams/CommunityDto;",
        "component8",
        "()Lcom/whoop/domain/model/teams/CommunityMemberDto;",
        "component9",
        "component10",
        "copy",
        "(ILjava/lang/String;ZIIILcom/whoop/domain/model/teams/CommunityDto;Lcom/whoop/domain/model/teams/CommunityMemberDto;Ljava/lang/String;Z)Lcom/whoop/domain/model/teams/TeamInviteDto;",
        "toString",
        "hashCode",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/domain/model/teams/TeamInviteDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "I",
        "getId",
        "Ljava/lang/String;",
        "getStatus",
        "Z",
        "getDeleted",
        "getCommunityId",
        "getSenderId",
        "getRecipientId",
        "Lcom/whoop/domain/model/teams/CommunityDto;",
        "getCommunity",
        "Lcom/whoop/domain/model/teams/CommunityMemberDto;",
        "getSender",
        "getInviteCode",
        "getInviteCode$annotations",
        "()V",
        "getShowBadge",
        "setShowBadge",
        "(Z)V",
        "getShowBadge$annotations",
        "Companion",
        "$serializer",
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

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final Companion:Lcom/whoop/domain/model/teams/TeamInviteDto$Companion;


# instance fields
.field private final community:Lcom/whoop/domain/model/teams/CommunityDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "community"
    .end annotation
.end field

.field private final communityId:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "community_id"
    .end annotation
.end field

.field private final deleted:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "deleted"
    .end annotation
.end field

.field private final id:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "id"
    .end annotation
.end field

.field private final inviteCode:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "community_invite_code"
    .end annotation
.end field

.field private final recipientId:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "recipient_id"
    .end annotation
.end field

.field private final sender:Lcom/whoop/domain/model/teams/CommunityMemberDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sender"
    .end annotation
.end field

.field private final senderId:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sender_id"
    .end annotation
.end field

.field private showBadge:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "showBadge"
    .end annotation
.end field

.field private final status:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "status"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/domain/model/teams/TeamInviteDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/domain/model/teams/TeamInviteDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/domain/model/teams/TeamInviteDto;->Companion:Lcom/whoop/domain/model/teams/TeamInviteDto$Companion;

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;ZIIILcom/whoop/domain/model/teams/CommunityDto;Lcom/whoop/domain/model/teams/CommunityMemberDto;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p12, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p12, :cond_0

    .line 1
    sget-object p12, Lcom/whoop/domain/model/teams/TeamInviteDto$$serializer;->INSTANCE:Lcom/whoop/domain/model/teams/TeamInviteDto$$serializer;

    invoke-virtual {p12}, Lcom/whoop/domain/model/teams/TeamInviteDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p12

    invoke-static {p1, v0, p12}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->id:I

    iput-object p3, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->status:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->deleted:Z

    iput p5, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->communityId:I

    iput p6, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->senderId:I

    iput p7, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->recipientId:I

    and-int/lit8 p2, p1, 0x40

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->community:Lcom/whoop/domain/model/teams/CommunityDto;

    goto :goto_0

    :cond_1
    iput-object p8, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->community:Lcom/whoop/domain/model/teams/CommunityDto;

    :goto_0
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->sender:Lcom/whoop/domain/model/teams/CommunityMemberDto;

    goto :goto_1

    :cond_2
    iput-object p9, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->sender:Lcom/whoop/domain/model/teams/CommunityMemberDto;

    :goto_1
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->inviteCode:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p10, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->inviteCode:Ljava/lang/String;

    :goto_2
    and-int/lit16 p1, p1, 0x200

    if-nez p1, :cond_4

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->showBadge:Z

    return-void

    :cond_4
    iput-boolean p11, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->showBadge:Z

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;ZIIILcom/whoop/domain/model/teams/CommunityDto;Lcom/whoop/domain/model/teams/CommunityMemberDto;Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "status"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->id:I

    .line 4
    iput-object p2, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->status:Ljava/lang/String;

    .line 5
    iput-boolean p3, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->deleted:Z

    .line 6
    iput p4, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->communityId:I

    .line 7
    iput p5, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->senderId:I

    .line 8
    iput p6, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->recipientId:I

    .line 9
    iput-object p7, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->community:Lcom/whoop/domain/model/teams/CommunityDto;

    .line 10
    iput-object p8, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->sender:Lcom/whoop/domain/model/teams/CommunityMemberDto;

    .line 11
    iput-object p9, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->inviteCode:Ljava/lang/String;

    .line 12
    iput-boolean p10, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->showBadge:Z

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ZIIILcom/whoop/domain/model/teams/CommunityDto;Lcom/whoop/domain/model/teams/CommunityMemberDto;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p12, p11, 0x40

    const/4 v0, 0x0

    if-eqz p12, :cond_0

    move-object p7, v0

    :cond_0
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_1

    move-object p8, v0

    :cond_1
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_2

    move-object p9, v0

    :cond_2
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_3

    const/4 p10, 0x1

    :cond_3
    move p11, p10

    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move-object p3, p2

    move p2, p1

    move-object p1, p0

    .line 13
    invoke-direct/range {p1 .. p11}, Lcom/whoop/domain/model/teams/TeamInviteDto;-><init>(ILjava/lang/String;ZIIILcom/whoop/domain/model/teams/CommunityDto;Lcom/whoop/domain/model/teams/CommunityMemberDto;Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/domain/model/teams/TeamInviteDto;ILjava/lang/String;ZIIILcom/whoop/domain/model/teams/CommunityDto;Lcom/whoop/domain/model/teams/CommunityMemberDto;Ljava/lang/String;ZILjava/lang/Object;)Lcom/whoop/domain/model/teams/TeamInviteDto;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget p1, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->id:I

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->status:Ljava/lang/String;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-boolean p3, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->deleted:Z

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget p4, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->communityId:I

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget p5, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->senderId:I

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget p6, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->recipientId:I

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->community:Lcom/whoop/domain/model/teams/CommunityDto;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->sender:Lcom/whoop/domain/model/teams/CommunityMemberDto;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->inviteCode:Ljava/lang/String;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-boolean p10, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->showBadge:Z

    :cond_9
    move-object p11, p9

    move p12, p10

    move-object p9, p7

    move-object p10, p8

    move p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/whoop/domain/model/teams/TeamInviteDto;->copy(ILjava/lang/String;ZIIILcom/whoop/domain/model/teams/CommunityDto;Lcom/whoop/domain/model/teams/CommunityMemberDto;Ljava/lang/String;Z)Lcom/whoop/domain/model/teams/TeamInviteDto;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getInviteCode$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "community_invite_code"
    .end annotation

    return-void
.end method

.method public static synthetic getShowBadge$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "showBadge"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/domain/model/teams/TeamInviteDto;Lzc3/c;Lyc3/g;)V
    .locals 4

    const/4 v0, 0x0

    iget v1, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->id:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->status:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1, v0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->deleted:Z

    invoke-interface {p1, p2, v0, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v0, 0x3

    iget v2, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->communityId:I

    invoke-interface {p1, p2, v0, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x4

    iget v2, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->senderId:I

    invoke-interface {p1, p2, v0, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x5

    iget v2, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->recipientId:I

    invoke-interface {p1, p2, v0, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->community:Lcom/whoop/domain/model/teams/CommunityDto;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lcom/whoop/domain/model/teams/CommunityDto$$serializer;->INSTANCE:Lcom/whoop/domain/model/teams/CommunityDto$$serializer;

    iget-object v3, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->community:Lcom/whoop/domain/model/teams/CommunityDto;

    invoke-interface {p1, p2, v0, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->sender:Lcom/whoop/domain/model/teams/CommunityMemberDto;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lcom/whoop/domain/model/teams/CommunityMemberDto$$serializer;->INSTANCE:Lcom/whoop/domain/model/teams/CommunityMemberDto$$serializer;

    iget-object v3, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->sender:Lcom/whoop/domain/model/teams/CommunityMemberDto;

    invoke-interface {p1, p2, v0, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->inviteCode:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->inviteCode:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/16 v0, 0x9

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->showBadge:Z

    if-eq v2, v1, :cond_7

    :goto_3
    iget-boolean p0, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->showBadge:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_7
    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->id:I

    return v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->showBadge:Z

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->status:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->deleted:Z

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->communityId:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->senderId:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->recipientId:I

    return v0
.end method

.method public final component7()Lcom/whoop/domain/model/teams/CommunityDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->community:Lcom/whoop/domain/model/teams/CommunityDto;

    return-object v0
.end method

.method public final component8()Lcom/whoop/domain/model/teams/CommunityMemberDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->sender:Lcom/whoop/domain/model/teams/CommunityMemberDto;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->inviteCode:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;ZIIILcom/whoop/domain/model/teams/CommunityDto;Lcom/whoop/domain/model/teams/CommunityMemberDto;Ljava/lang/String;Z)Lcom/whoop/domain/model/teams/TeamInviteDto;
    .locals 12

    const-string v0, "status"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/domain/model/teams/TeamInviteDto;

    move v2, p1

    move-object v3, p2

    move v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lcom/whoop/domain/model/teams/TeamInviteDto;-><init>(ILjava/lang/String;ZIIILcom/whoop/domain/model/teams/CommunityDto;Lcom/whoop/domain/model/teams/CommunityMemberDto;Ljava/lang/String;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/domain/model/teams/TeamInviteDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/domain/model/teams/TeamInviteDto;

    iget v1, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->id:I

    iget v3, p1, Lcom/whoop/domain/model/teams/TeamInviteDto;->id:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->status:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamInviteDto;->status:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->deleted:Z

    iget-boolean v3, p1, Lcom/whoop/domain/model/teams/TeamInviteDto;->deleted:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->communityId:I

    iget v3, p1, Lcom/whoop/domain/model/teams/TeamInviteDto;->communityId:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->senderId:I

    iget v3, p1, Lcom/whoop/domain/model/teams/TeamInviteDto;->senderId:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->recipientId:I

    iget v3, p1, Lcom/whoop/domain/model/teams/TeamInviteDto;->recipientId:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->community:Lcom/whoop/domain/model/teams/CommunityDto;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamInviteDto;->community:Lcom/whoop/domain/model/teams/CommunityDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->sender:Lcom/whoop/domain/model/teams/CommunityMemberDto;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamInviteDto;->sender:Lcom/whoop/domain/model/teams/CommunityMemberDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->inviteCode:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamInviteDto;->inviteCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->showBadge:Z

    iget-boolean p1, p1, Lcom/whoop/domain/model/teams/TeamInviteDto;->showBadge:Z

    if-eq v1, p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getCommunity()Lcom/whoop/domain/model/teams/CommunityDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->community:Lcom/whoop/domain/model/teams/CommunityDto;

    return-object v0
.end method

.method public final getCommunityId()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->communityId:I

    return v0
.end method

.method public final getDeleted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->deleted:Z

    return v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->id:I

    return v0
.end method

.method public final getInviteCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->inviteCode:Ljava/lang/String;

    return-object v0
.end method

.method public final getRecipientId()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->recipientId:I

    return v0
.end method

.method public final getSender()Lcom/whoop/domain/model/teams/CommunityMemberDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->sender:Lcom/whoop/domain/model/teams/CommunityMemberDto;

    return-object v0
.end method

.method public final getSenderId()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->senderId:I

    return v0
.end method

.method public final getShowBadge()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->showBadge:Z

    return v0
.end method

.method public final getStatus()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->status:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->status:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->deleted:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget v2, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->communityId:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->senderId:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->recipientId:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->community:Lcom/whoop/domain/model/teams/CommunityDto;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/domain/model/teams/CommunityDto;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->sender:Lcom/whoop/domain/model/teams/CommunityMemberDto;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/domain/model/teams/CommunityMemberDto;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->inviteCode:Ljava/lang/String;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v1, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->showBadge:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final setShowBadge(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->showBadge:Z

    return-void
.end method

.method public final toDrawerDisplayInvite()Lcom/whoop/domain/model/teams/DrawerDisplayInvite;
    .locals 10

    new-instance v0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;

    iget v1, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->id:I

    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->status:Ljava/lang/String;

    iget v3, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->communityId:I

    iget-object v4, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->community:Lcom/whoop/domain/model/teams/CommunityDto;

    const-string v5, "???"

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/whoop/domain/model/teams/CommunityDto;->getName()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1

    :cond_0
    move-object v4, v5

    :cond_1
    iget-object v6, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->community:Lcom/whoop/domain/model/teams/CommunityDto;

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Lcom/whoop/domain/model/teams/CommunityDto;->getAvatar()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_3

    :cond_2
    const-string v6, ""

    :cond_3
    iget v7, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->senderId:I

    iget-object v8, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->sender:Lcom/whoop/domain/model/teams/CommunityMemberDto;

    if-eqz v8, :cond_5

    invoke-virtual {v8}, Lcom/whoop/domain/model/teams/CommunityMemberDto;->getUsername()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_4

    goto :goto_0

    :cond_4
    move-object v5, v8

    :cond_5
    :goto_0
    const-string v8, "@"

    invoke-virtual {v8, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-object v8, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->inviteCode:Ljava/lang/String;

    move v9, v7

    move-object v7, v5

    move-object v5, v6

    move v6, v9

    invoke-direct/range {v0 .. v8}, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;-><init>(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget v0, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->id:I

    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->status:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->deleted:Z

    iget v3, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->communityId:I

    iget v4, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->senderId:I

    iget v5, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->recipientId:I

    iget-object v6, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->community:Lcom/whoop/domain/model/teams/CommunityDto;

    iget-object v7, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->sender:Lcom/whoop/domain/model/teams/CommunityMemberDto;

    iget-object v8, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->inviteCode:Ljava/lang/String;

    iget-boolean v9, p0, Lcom/whoop/domain/model/teams/TeamInviteDto;->showBadge:Z

    const-string v10, ", status="

    const-string v11, ", deleted="

    const-string v12, "TeamInviteDto(id="

    invoke-static {v0, v12, v10, v1, v11}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", communityId="

    const-string v10, ", senderId="

    invoke-static {v3, v1, v10, v0, v2}, Lr;->r(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    const-string v1, ", recipientId="

    const-string v2, ", community="

    invoke-static {v0, v4, v1, v5, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sender="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", inviteCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", showBadge="

    const-string v2, ")"

    invoke-static {v0, v8, v1, v9, v2}, Ljh3/c;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

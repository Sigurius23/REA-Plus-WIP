.class public final Lcom/whoop/profile/domain/models/MembershipData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/profile/domain/models/MembershipData$$serializer;,
        Lcom/whoop/profile/domain/models/MembershipData$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\'\u0008\u0087\u0008\u0018\u0000 ?2\u00020\u0001:\u0002@?Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fBs\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010!J\u0010\u0010#\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010!J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010(Jv\u0010+\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010!J\u0010\u0010.\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u001a\u00101\u001a\u00020\u00022\u0008\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00081\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00103\u001a\u0004\u0008\u0003\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00104\u001a\u0004\u00085\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00104\u001a\u0004\u00086\u0010!R\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00104\u001a\u0004\u00087\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00108\u001a\u0004\u00089\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00104\u001a\u0004\u0008:\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010;\u001a\u0004\u0008<\u0010(R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010;\u001a\u0004\u0008=\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010;\u001a\u0004\u0008>\u0010(\u00a8\u0006A"
    }
    d2 = {
        "Lcom/whoop/profile/domain/models/MembershipData;",
        "",
        "",
        "isFoundingMember",
        "",
        "memberSinceTitle",
        "memberSinceDate",
        "icon",
        "Lcom/whoop/profile/domain/models/BottomSheet;",
        "bottomSheet",
        "followingState",
        "communityVisible",
        "ageVisible",
        "locationVisible",
        "<init>",
        "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/profile/domain/models/BottomSheet;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/profile/domain/models/BottomSheet;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$profile_release",
        "(Lcom/whoop/profile/domain/models/MembershipData;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Z",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "()Lcom/whoop/profile/domain/models/BottomSheet;",
        "component6",
        "component7",
        "()Ljava/lang/Boolean;",
        "component8",
        "component9",
        "copy",
        "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/profile/domain/models/BottomSheet;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/profile/domain/models/MembershipData;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Z",
        "Ljava/lang/String;",
        "getMemberSinceTitle",
        "getMemberSinceDate",
        "getIcon",
        "Lcom/whoop/profile/domain/models/BottomSheet;",
        "getBottomSheet",
        "getFollowingState",
        "Ljava/lang/Boolean;",
        "getCommunityVisible",
        "getAgeVisible",
        "getLocationVisible",
        "Companion",
        "$serializer",
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

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/profile/domain/models/MembershipData$Companion;


# instance fields
.field private final ageVisible:Ljava/lang/Boolean;

.field private final bottomSheet:Lcom/whoop/profile/domain/models/BottomSheet;

.field private final communityVisible:Ljava/lang/Boolean;

.field private final followingState:Ljava/lang/String;

.field private final icon:Ljava/lang/String;

.field private final isFoundingMember:Z

.field private final locationVisible:Ljava/lang/Boolean;

.field private final memberSinceDate:Ljava/lang/String;

.field private final memberSinceTitle:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/profile/domain/models/MembershipData$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/profile/domain/models/MembershipData$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/profile/domain/models/MembershipData;->Companion:Lcom/whoop/profile/domain/models/MembershipData$Companion;

    return-void
.end method

.method public synthetic constructor <init>(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/profile/domain/models/BottomSheet;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/profile/domain/models/MembershipData$$serializer;->INSTANCE:Lcom/whoop/profile/domain/models/MembershipData$$serializer;

    invoke-virtual {p11}, Lcom/whoop/profile/domain/models/MembershipData$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lcom/whoop/profile/domain/models/MembershipData;->isFoundingMember:Z

    iput-object p3, p0, Lcom/whoop/profile/domain/models/MembershipData;->memberSinceTitle:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/profile/domain/models/MembershipData;->memberSinceDate:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/profile/domain/models/MembershipData;->icon:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x10

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/profile/domain/models/MembershipData;->bottomSheet:Lcom/whoop/profile/domain/models/BottomSheet;

    goto :goto_0

    :cond_1
    iput-object p6, p0, Lcom/whoop/profile/domain/models/MembershipData;->bottomSheet:Lcom/whoop/profile/domain/models/BottomSheet;

    :goto_0
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/profile/domain/models/MembershipData;->followingState:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p7, p0, Lcom/whoop/profile/domain/models/MembershipData;->followingState:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/profile/domain/models/MembershipData;->communityVisible:Ljava/lang/Boolean;

    goto :goto_2

    :cond_3
    iput-object p8, p0, Lcom/whoop/profile/domain/models/MembershipData;->communityVisible:Ljava/lang/Boolean;

    :goto_2
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/profile/domain/models/MembershipData;->ageVisible:Ljava/lang/Boolean;

    goto :goto_3

    :cond_4
    iput-object p9, p0, Lcom/whoop/profile/domain/models/MembershipData;->ageVisible:Ljava/lang/Boolean;

    :goto_3
    and-int/lit16 p1, p1, 0x100

    if-nez p1, :cond_5

    iput-object p3, p0, Lcom/whoop/profile/domain/models/MembershipData;->locationVisible:Ljava/lang/Boolean;

    return-void

    :cond_5
    iput-object p10, p0, Lcom/whoop/profile/domain/models/MembershipData;->locationVisible:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/profile/domain/models/BottomSheet;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 1

    const-string v0, "memberSinceTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/whoop/profile/domain/models/MembershipData;->isFoundingMember:Z

    .line 4
    iput-object p2, p0, Lcom/whoop/profile/domain/models/MembershipData;->memberSinceTitle:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/profile/domain/models/MembershipData;->memberSinceDate:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/profile/domain/models/MembershipData;->icon:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/profile/domain/models/MembershipData;->bottomSheet:Lcom/whoop/profile/domain/models/BottomSheet;

    .line 8
    iput-object p6, p0, Lcom/whoop/profile/domain/models/MembershipData;->followingState:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/profile/domain/models/MembershipData;->communityVisible:Ljava/lang/Boolean;

    .line 10
    iput-object p8, p0, Lcom/whoop/profile/domain/models/MembershipData;->ageVisible:Ljava/lang/Boolean;

    .line 11
    iput-object p9, p0, Lcom/whoop/profile/domain/models/MembershipData;->locationVisible:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/profile/domain/models/BottomSheet;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p10, 0x10

    const/4 v0, 0x0

    if-eqz p11, :cond_0

    move-object p5, v0

    :cond_0
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_1

    move-object p6, v0

    :cond_1
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_2

    move-object p7, v0

    :cond_2
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_3

    move-object p8, v0

    :cond_3
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_4

    move-object p10, v0

    :goto_0
    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_4
    move-object p10, p9

    goto :goto_0

    .line 12
    :goto_1
    invoke-direct/range {p1 .. p10}, Lcom/whoop/profile/domain/models/MembershipData;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/profile/domain/models/BottomSheet;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/profile/domain/models/MembershipData;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/profile/domain/models/BottomSheet;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/whoop/profile/domain/models/MembershipData;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-boolean p1, p0, Lcom/whoop/profile/domain/models/MembershipData;->isFoundingMember:Z

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/profile/domain/models/MembershipData;->memberSinceTitle:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/profile/domain/models/MembershipData;->memberSinceDate:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/profile/domain/models/MembershipData;->icon:Ljava/lang/String;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/profile/domain/models/MembershipData;->bottomSheet:Lcom/whoop/profile/domain/models/BottomSheet;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/profile/domain/models/MembershipData;->followingState:Ljava/lang/String;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/profile/domain/models/MembershipData;->communityVisible:Ljava/lang/Boolean;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/profile/domain/models/MembershipData;->ageVisible:Ljava/lang/Boolean;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/profile/domain/models/MembershipData;->locationVisible:Ljava/lang/Boolean;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/profile/domain/models/MembershipData;->copy(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/profile/domain/models/BottomSheet;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/profile/domain/models/MembershipData;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$profile_release(Lcom/whoop/profile/domain/models/MembershipData;Lzc3/c;Lyc3/g;)V
    .locals 4

    const/4 v0, 0x0

    iget-boolean v1, p0, Lcom/whoop/profile/domain/models/MembershipData;->isFoundingMember:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/profile/domain/models/MembershipData;->memberSinceTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/profile/domain/models/MembershipData;->memberSinceDate:Ljava/lang/String;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/profile/domain/models/MembershipData;->icon:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/profile/domain/models/MembershipData;->bottomSheet:Lcom/whoop/profile/domain/models/BottomSheet;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lcom/whoop/profile/domain/models/BottomSheet$$serializer;->INSTANCE:Lcom/whoop/profile/domain/models/BottomSheet$$serializer;

    iget-object v3, p0, Lcom/whoop/profile/domain/models/MembershipData;->bottomSheet:Lcom/whoop/profile/domain/models/BottomSheet;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/profile/domain/models/MembershipData;->followingState:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_1
    iget-object v2, p0, Lcom/whoop/profile/domain/models/MembershipData;->followingState:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/profile/domain/models/MembershipData;->communityVisible:Ljava/lang/Boolean;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v2, p0, Lcom/whoop/profile/domain/models/MembershipData;->communityVisible:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/profile/domain/models/MembershipData;->ageVisible:Ljava/lang/Boolean;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v2, p0, Lcom/whoop/profile/domain/models/MembershipData;->ageVisible:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/profile/domain/models/MembershipData;->locationVisible:Ljava/lang/Boolean;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object p0, p0, Lcom/whoop/profile/domain/models/MembershipData;->locationVisible:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    return-void
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/domain/models/MembershipData;->isFoundingMember:Z

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/MembershipData;->memberSinceTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/MembershipData;->memberSinceDate:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/MembershipData;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/profile/domain/models/BottomSheet;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/MembershipData;->bottomSheet:Lcom/whoop/profile/domain/models/BottomSheet;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/MembershipData;->followingState:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/MembershipData;->communityVisible:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component8()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/MembershipData;->ageVisible:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component9()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/MembershipData;->locationVisible:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final copy(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/profile/domain/models/BottomSheet;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/profile/domain/models/MembershipData;
    .locals 11

    const-string v0, "memberSinceTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/profile/domain/models/MembershipData;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/whoop/profile/domain/models/MembershipData;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/profile/domain/models/BottomSheet;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/profile/domain/models/MembershipData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/profile/domain/models/MembershipData;

    iget-boolean v1, p0, Lcom/whoop/profile/domain/models/MembershipData;->isFoundingMember:Z

    iget-boolean v3, p1, Lcom/whoop/profile/domain/models/MembershipData;->isFoundingMember:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/profile/domain/models/MembershipData;->memberSinceTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/domain/models/MembershipData;->memberSinceTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/profile/domain/models/MembershipData;->memberSinceDate:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/domain/models/MembershipData;->memberSinceDate:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/profile/domain/models/MembershipData;->icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/domain/models/MembershipData;->icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/profile/domain/models/MembershipData;->bottomSheet:Lcom/whoop/profile/domain/models/BottomSheet;

    iget-object v3, p1, Lcom/whoop/profile/domain/models/MembershipData;->bottomSheet:Lcom/whoop/profile/domain/models/BottomSheet;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/profile/domain/models/MembershipData;->followingState:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/domain/models/MembershipData;->followingState:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/profile/domain/models/MembershipData;->communityVisible:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/profile/domain/models/MembershipData;->communityVisible:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/profile/domain/models/MembershipData;->ageVisible:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/profile/domain/models/MembershipData;->ageVisible:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/profile/domain/models/MembershipData;->locationVisible:Ljava/lang/Boolean;

    iget-object p1, p1, Lcom/whoop/profile/domain/models/MembershipData;->locationVisible:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getAgeVisible()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/MembershipData;->ageVisible:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getBottomSheet()Lcom/whoop/profile/domain/models/BottomSheet;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/MembershipData;->bottomSheet:Lcom/whoop/profile/domain/models/BottomSheet;

    return-object v0
.end method

.method public final getCommunityVisible()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/MembershipData;->communityVisible:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getFollowingState()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/MembershipData;->followingState:Ljava/lang/String;

    return-object v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/MembershipData;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getLocationVisible()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/MembershipData;->locationVisible:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getMemberSinceDate()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/MembershipData;->memberSinceDate:Ljava/lang/String;

    return-object v0
.end method

.method public final getMemberSinceTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/MembershipData;->memberSinceTitle:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lcom/whoop/profile/domain/models/MembershipData;->isFoundingMember:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/profile/domain/models/MembershipData;->memberSinceTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/profile/domain/models/MembershipData;->memberSinceDate:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/profile/domain/models/MembershipData;->icon:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/profile/domain/models/MembershipData;->bottomSheet:Lcom/whoop/profile/domain/models/BottomSheet;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/profile/domain/models/BottomSheet;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/profile/domain/models/MembershipData;->followingState:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/profile/domain/models/MembershipData;->communityVisible:Ljava/lang/Boolean;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/profile/domain/models/MembershipData;->ageVisible:Ljava/lang/Boolean;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/profile/domain/models/MembershipData;->locationVisible:Ljava/lang/Boolean;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    return v0
.end method

.method public final isFoundingMember()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/domain/models/MembershipData;->isFoundingMember:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-boolean v0, p0, Lcom/whoop/profile/domain/models/MembershipData;->isFoundingMember:Z

    iget-object v1, p0, Lcom/whoop/profile/domain/models/MembershipData;->memberSinceTitle:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/profile/domain/models/MembershipData;->memberSinceDate:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/profile/domain/models/MembershipData;->icon:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/profile/domain/models/MembershipData;->bottomSheet:Lcom/whoop/profile/domain/models/BottomSheet;

    iget-object v5, p0, Lcom/whoop/profile/domain/models/MembershipData;->followingState:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/profile/domain/models/MembershipData;->communityVisible:Ljava/lang/Boolean;

    iget-object v7, p0, Lcom/whoop/profile/domain/models/MembershipData;->ageVisible:Ljava/lang/Boolean;

    iget-object v8, p0, Lcom/whoop/profile/domain/models/MembershipData;->locationVisible:Ljava/lang/Boolean;

    const-string v9, ", memberSinceTitle="

    const-string v10, ", memberSinceDate="

    const-string v11, "MembershipData(isFoundingMember="

    invoke-static {v11, v9, v1, v10, v0}, Lev/n;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", icon="

    const-string v9, ", bottomSheet="

    invoke-static {v0, v2, v1, v3, v9}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", followingState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", communityVisible="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", ageVisible="

    const-string v2, ", locationVisible="

    invoke-static {v0, v6, v1, v7, v2}, Lc13/a;->w(Ljava/lang/StringBuilder;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    const-string v1, ")"

    invoke-static {v0, v8, v1}, Ld13/a;->j(Ljava/lang/StringBuilder;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

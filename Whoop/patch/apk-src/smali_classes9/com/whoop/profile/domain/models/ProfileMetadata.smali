.class public final Lcom/whoop/profile/domain/models/ProfileMetadata;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/profile/domain/models/ProfileMetadata$$serializer;,
        Lcom/whoop/profile/domain/models/ProfileMetadata$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008#\u0008\u0087\u0008\u0018\u0000 :2\u00020\u0001:\u0002;:B;\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eBU\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'JP\u0010(\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u001a\u0010.\u001a\u00020\u00052\u0008\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00100\u001a\u0004\u00081\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00100\u001a\u0004\u00082\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00103\u001a\u0004\u0008\u0006\u0010!R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00104\u001a\u0004\u00085\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00106\u001a\u0004\u00087\u0010%R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00108\u001a\u0004\u00089\u0010\'\u00a8\u0006<"
    }
    d2 = {
        "Lcom/whoop/profile/domain/models/ProfileMetadata;",
        "",
        "",
        "entitlementsImageUrl",
        "editButtonTitle",
        "",
        "isSelfProfile",
        "Lcom/whoop/profile/domain/models/UserData;",
        "userData",
        "Lcom/whoop/profile/domain/models/MembershipData;",
        "membershipData",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "editButtonAnalyticEvent",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/profile/domain/models/UserData;Lcom/whoop/profile/domain/models/MembershipData;Lcom/whoop/analytics/AnalyticEventModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;ZLcom/whoop/profile/domain/models/UserData;Lcom/whoop/profile/domain/models/MembershipData;Lcom/whoop/analytics/AnalyticEventModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$profile_release",
        "(Lcom/whoop/profile/domain/models/ProfileMetadata;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Z",
        "component4",
        "()Lcom/whoop/profile/domain/models/UserData;",
        "component5",
        "()Lcom/whoop/profile/domain/models/MembershipData;",
        "component6",
        "()Lcom/whoop/analytics/AnalyticEventModel;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/profile/domain/models/UserData;Lcom/whoop/profile/domain/models/MembershipData;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/profile/domain/models/ProfileMetadata;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getEntitlementsImageUrl",
        "getEditButtonTitle",
        "Z",
        "Lcom/whoop/profile/domain/models/UserData;",
        "getUserData",
        "Lcom/whoop/profile/domain/models/MembershipData;",
        "getMembershipData",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "getEditButtonAnalyticEvent",
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

.field public static final Companion:Lcom/whoop/profile/domain/models/ProfileMetadata$Companion;


# instance fields
.field private final editButtonAnalyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

.field private final editButtonTitle:Ljava/lang/String;

.field private final entitlementsImageUrl:Ljava/lang/String;

.field private final isSelfProfile:Z

.field private final membershipData:Lcom/whoop/profile/domain/models/MembershipData;

.field private final userData:Lcom/whoop/profile/domain/models/UserData;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/profile/domain/models/ProfileMetadata$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/profile/domain/models/ProfileMetadata$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/profile/domain/models/ProfileMetadata;->Companion:Lcom/whoop/profile/domain/models/ProfileMetadata$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/profile/domain/models/ProfileMetadata;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;ZLcom/whoop/profile/domain/models/UserData;Lcom/whoop/profile/domain/models/MembershipData;Lcom/whoop/analytics/AnalyticEventModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/profile/domain/models/ProfileMetadata$$serializer;->INSTANCE:Lcom/whoop/profile/domain/models/ProfileMetadata$$serializer;

    invoke-virtual {p8}, Lcom/whoop/profile/domain/models/ProfileMetadata$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->entitlementsImageUrl:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->editButtonTitle:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->isSelfProfile:Z

    iput-object p5, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->userData:Lcom/whoop/profile/domain/models/UserData;

    iput-object p6, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->membershipData:Lcom/whoop/profile/domain/models/MembershipData;

    iput-object p7, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->editButtonAnalyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/profile/domain/models/UserData;Lcom/whoop/profile/domain/models/MembershipData;Lcom/whoop/analytics/AnalyticEventModel;)V
    .locals 1

    const-string v0, "editButtonTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userData"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "membershipData"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->entitlementsImageUrl:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->editButtonTitle:Ljava/lang/String;

    .line 5
    iput-boolean p3, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->isSelfProfile:Z

    .line 6
    iput-object p4, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->userData:Lcom/whoop/profile/domain/models/UserData;

    .line 7
    iput-object p5, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->membershipData:Lcom/whoop/profile/domain/models/MembershipData;

    .line 8
    iput-object p6, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->editButtonAnalyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/profile/domain/models/ProfileMetadata;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/profile/domain/models/UserData;Lcom/whoop/profile/domain/models/MembershipData;Lcom/whoop/analytics/AnalyticEventModel;ILjava/lang/Object;)Lcom/whoop/profile/domain/models/ProfileMetadata;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->entitlementsImageUrl:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->editButtonTitle:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-boolean p3, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->isSelfProfile:Z

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->userData:Lcom/whoop/profile/domain/models/UserData;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->membershipData:Lcom/whoop/profile/domain/models/MembershipData;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->editButtonAnalyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/profile/domain/models/ProfileMetadata;->copy(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/profile/domain/models/UserData;Lcom/whoop/profile/domain/models/MembershipData;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/profile/domain/models/ProfileMetadata;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$profile_release(Lcom/whoop/profile/domain/models/ProfileMetadata;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->entitlementsImageUrl:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->editButtonTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-boolean v1, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->isSelfProfile:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v0, Lcom/whoop/profile/domain/models/UserData$$serializer;->INSTANCE:Lcom/whoop/profile/domain/models/UserData$$serializer;

    iget-object v1, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->userData:Lcom/whoop/profile/domain/models/UserData;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/profile/domain/models/MembershipData$$serializer;->INSTANCE:Lcom/whoop/profile/domain/models/MembershipData$$serializer;

    iget-object v1, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->membershipData:Lcom/whoop/profile/domain/models/MembershipData;

    const/4 v2, 0x4

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/analytics/AnalyticEventModel$$serializer;->INSTANCE:Lcom/whoop/analytics/AnalyticEventModel$$serializer;

    iget-object p0, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->editButtonAnalyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->entitlementsImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->editButtonTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->isSelfProfile:Z

    return v0
.end method

.method public final component4()Lcom/whoop/profile/domain/models/UserData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->userData:Lcom/whoop/profile/domain/models/UserData;

    return-object v0
.end method

.method public final component5()Lcom/whoop/profile/domain/models/MembershipData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->membershipData:Lcom/whoop/profile/domain/models/MembershipData;

    return-object v0
.end method

.method public final component6()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->editButtonAnalyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/profile/domain/models/UserData;Lcom/whoop/profile/domain/models/MembershipData;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/profile/domain/models/ProfileMetadata;
    .locals 8

    const-string v0, "editButtonTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userData"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "membershipData"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/profile/domain/models/ProfileMetadata;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/profile/domain/models/ProfileMetadata;-><init>(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/profile/domain/models/UserData;Lcom/whoop/profile/domain/models/MembershipData;Lcom/whoop/analytics/AnalyticEventModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/profile/domain/models/ProfileMetadata;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/profile/domain/models/ProfileMetadata;

    iget-object v1, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->entitlementsImageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/domain/models/ProfileMetadata;->entitlementsImageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->editButtonTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/domain/models/ProfileMetadata;->editButtonTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->isSelfProfile:Z

    iget-boolean v3, p1, Lcom/whoop/profile/domain/models/ProfileMetadata;->isSelfProfile:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->userData:Lcom/whoop/profile/domain/models/UserData;

    iget-object v3, p1, Lcom/whoop/profile/domain/models/ProfileMetadata;->userData:Lcom/whoop/profile/domain/models/UserData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->membershipData:Lcom/whoop/profile/domain/models/MembershipData;

    iget-object v3, p1, Lcom/whoop/profile/domain/models/ProfileMetadata;->membershipData:Lcom/whoop/profile/domain/models/MembershipData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->editButtonAnalyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    iget-object p1, p1, Lcom/whoop/profile/domain/models/ProfileMetadata;->editButtonAnalyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getEditButtonAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->editButtonAnalyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-object v0
.end method

.method public final getEditButtonTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->editButtonTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getEntitlementsImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->entitlementsImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getMembershipData()Lcom/whoop/profile/domain/models/MembershipData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->membershipData:Lcom/whoop/profile/domain/models/MembershipData;

    return-object v0
.end method

.method public final getUserData()Lcom/whoop/profile/domain/models/UserData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->userData:Lcom/whoop/profile/domain/models/UserData;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->entitlementsImageUrl:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->editButtonTitle:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v3, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->isSelfProfile:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->userData:Lcom/whoop/profile/domain/models/UserData;

    invoke-virtual {v3}, Lcom/whoop/profile/domain/models/UserData;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->membershipData:Lcom/whoop/profile/domain/models/MembershipData;

    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/MembershipData;->hashCode()I

    move-result v0

    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->editButtonAnalyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/analytics/AnalyticEventModel;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public final isSelfProfile()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->isSelfProfile:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->entitlementsImageUrl:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->editButtonTitle:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->isSelfProfile:Z

    iget-object v3, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->userData:Lcom/whoop/profile/domain/models/UserData;

    iget-object v4, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->membershipData:Lcom/whoop/profile/domain/models/MembershipData;

    iget-object v5, p0, Lcom/whoop/profile/domain/models/ProfileMetadata;->editButtonAnalyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    const-string v6, ", editButtonTitle="

    const-string v7, ", isSelfProfile="

    const-string v8, "ProfileMetadata(entitlementsImageUrl="

    invoke-static {v8, v0, v6, v1, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", userData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", membershipData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", editButtonAnalyticEvent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final Lcom/whoop/privacyconsent/api/SearchableSetting;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/privacyconsent/api/SearchableSetting$$serializer;,
        Lcom/whoop/privacyconsent/api/SearchableSetting$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006B+\u0008\u0010\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u0005\u0010\u000bJ\'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00022\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008 \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\"\u001a\u0004\u0008#\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\"\u001a\u0004\u0008$\u0010\u0016\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/whoop/privacyconsent/api/SearchableSetting;",
        "",
        "",
        "searchable",
        "mutualCommunitySharing",
        "<init>",
        "(ZZ)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$privacy_consent_release",
        "(Lcom/whoop/privacyconsent/api/SearchableSetting;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Z",
        "component2",
        "copy",
        "(ZZ)Lcom/whoop/privacyconsent/api/SearchableSetting;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Z",
        "getSearchable",
        "getMutualCommunitySharing",
        "Companion",
        "$serializer",
        "privacy-consent_release"
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

.field public static final Companion:Lcom/whoop/privacyconsent/api/SearchableSetting$Companion;


# instance fields
.field private final mutualCommunitySharing:Z

.field private final searchable:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/privacyconsent/api/SearchableSetting$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/privacyconsent/api/SearchableSetting$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/privacyconsent/api/SearchableSetting;->Companion:Lcom/whoop/privacyconsent/api/SearchableSetting$Companion;

    return-void
.end method

.method public synthetic constructor <init>(IZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p4, :cond_0

    .line 1
    sget-object p4, Lcom/whoop/privacyconsent/api/SearchableSetting$$serializer;->INSTANCE:Lcom/whoop/privacyconsent/api/SearchableSetting$$serializer;

    invoke-virtual {p4}, Lcom/whoop/privacyconsent/api/SearchableSetting$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p4

    invoke-static {p1, v0, p4}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lcom/whoop/privacyconsent/api/SearchableSetting;->searchable:Z

    iput-boolean p3, p0, Lcom/whoop/privacyconsent/api/SearchableSetting;->mutualCommunitySharing:Z

    return-void
.end method

.method public constructor <init>(ZZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/whoop/privacyconsent/api/SearchableSetting;->searchable:Z

    .line 4
    iput-boolean p2, p0, Lcom/whoop/privacyconsent/api/SearchableSetting;->mutualCommunitySharing:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/privacyconsent/api/SearchableSetting;ZZILjava/lang/Object;)Lcom/whoop/privacyconsent/api/SearchableSetting;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-boolean p1, p0, Lcom/whoop/privacyconsent/api/SearchableSetting;->searchable:Z

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-boolean p2, p0, Lcom/whoop/privacyconsent/api/SearchableSetting;->mutualCommunitySharing:Z

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/privacyconsent/api/SearchableSetting;->copy(ZZ)Lcom/whoop/privacyconsent/api/SearchableSetting;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$privacy_consent_release(Lcom/whoop/privacyconsent/api/SearchableSetting;Lzc3/c;Lyc3/g;)V
    .locals 2

    const/4 v0, 0x0

    iget-boolean v1, p0, Lcom/whoop/privacyconsent/api/SearchableSetting;->searchable:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v0, 0x1

    iget-boolean p0, p0, Lcom/whoop/privacyconsent/api/SearchableSetting;->mutualCommunitySharing:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    return-void
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/privacyconsent/api/SearchableSetting;->searchable:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/privacyconsent/api/SearchableSetting;->mutualCommunitySharing:Z

    return v0
.end method

.method public final copy(ZZ)Lcom/whoop/privacyconsent/api/SearchableSetting;
    .locals 1

    new-instance v0, Lcom/whoop/privacyconsent/api/SearchableSetting;

    invoke-direct {v0, p1, p2}, Lcom/whoop/privacyconsent/api/SearchableSetting;-><init>(ZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/privacyconsent/api/SearchableSetting;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/privacyconsent/api/SearchableSetting;

    iget-boolean v1, p0, Lcom/whoop/privacyconsent/api/SearchableSetting;->searchable:Z

    iget-boolean v3, p1, Lcom/whoop/privacyconsent/api/SearchableSetting;->searchable:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/privacyconsent/api/SearchableSetting;->mutualCommunitySharing:Z

    iget-boolean p1, p1, Lcom/whoop/privacyconsent/api/SearchableSetting;->mutualCommunitySharing:Z

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getMutualCommunitySharing()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/privacyconsent/api/SearchableSetting;->mutualCommunitySharing:Z

    return v0
.end method

.method public final getSearchable()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/privacyconsent/api/SearchableSetting;->searchable:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/whoop/privacyconsent/api/SearchableSetting;->searchable:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/whoop/privacyconsent/api/SearchableSetting;->mutualCommunitySharing:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-boolean v0, p0, Lcom/whoop/privacyconsent/api/SearchableSetting;->searchable:Z

    iget-boolean v1, p0, Lcom/whoop/privacyconsent/api/SearchableSetting;->mutualCommunitySharing:Z

    const-string v2, ", mutualCommunitySharing="

    const-string v3, ")"

    const-string v4, "SearchableSetting(searchable="

    invoke-static {v4, v2, v3, v0, v1}, Lr;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

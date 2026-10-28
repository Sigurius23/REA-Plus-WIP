.class public final Lcom/whoop/navigation/CommunityTeamScreenModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/navigation/CommonNavigationScreenModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/navigation/CommunityTeamScreenModel$$serializer;,
        Lcom/whoop/navigation/CommunityTeamScreenModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0087\u0008\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B#\u0008\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\tJ\'\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u0014J\u001a\u0010\u001e\u001a\u00020\u001d2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010 \u001a\u0004\u0008!\u0010\u0014\u00a8\u0006%"
    }
    d2 = {
        "Lcom/whoop/navigation/CommunityTeamScreenModel;",
        "Lcom/whoop/navigation/CommonNavigationScreenModel;",
        "",
        "id",
        "<init>",
        "(I)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IILkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$navigation_release",
        "(Lcom/whoop/navigation/CommunityTeamScreenModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()I",
        "copy",
        "(I)Lcom/whoop/navigation/CommunityTeamScreenModel;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getId",
        "Companion",
        "$serializer",
        "a",
        "navigation_release"
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

.field public static final Companion:Lcom/whoop/navigation/CommunityTeamScreenModel$a;


# instance fields
.field private final id:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/navigation/CommunityTeamScreenModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/navigation/CommunityTeamScreenModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/navigation/CommunityTeamScreenModel;->Companion:Lcom/whoop/navigation/CommunityTeamScreenModel$a;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/whoop/navigation/CommunityTeamScreenModel;->id:I

    return-void
.end method

.method public synthetic constructor <init>(IILkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p3, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p3, :cond_0

    .line 3
    sget-object p3, Lcom/whoop/navigation/CommunityTeamScreenModel$$serializer;->INSTANCE:Lcom/whoop/navigation/CommunityTeamScreenModel$$serializer;

    invoke-virtual {p3}, Lcom/whoop/navigation/CommunityTeamScreenModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p3

    invoke-static {p1, v0, p3}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/navigation/CommunityTeamScreenModel;->id:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/navigation/CommunityTeamScreenModel;IILjava/lang/Object;)Lcom/whoop/navigation/CommunityTeamScreenModel;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget p1, p0, Lcom/whoop/navigation/CommunityTeamScreenModel;->id:I

    :cond_0
    invoke-virtual {p0, p1}, Lcom/whoop/navigation/CommunityTeamScreenModel;->copy(I)Lcom/whoop/navigation/CommunityTeamScreenModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$navigation_release(Lcom/whoop/navigation/CommunityTeamScreenModel;Lzc3/c;Lyc3/g;)V
    .locals 1

    const/4 v0, 0x0

    iget p0, p0, Lcom/whoop/navigation/CommunityTeamScreenModel;->id:I

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/navigation/CommunityTeamScreenModel;->id:I

    return v0
.end method

.method public final copy(I)Lcom/whoop/navigation/CommunityTeamScreenModel;
    .locals 1

    new-instance v0, Lcom/whoop/navigation/CommunityTeamScreenModel;

    invoke-direct {v0, p1}, Lcom/whoop/navigation/CommunityTeamScreenModel;-><init>(I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/navigation/CommunityTeamScreenModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/navigation/CommunityTeamScreenModel;

    iget v1, p0, Lcom/whoop/navigation/CommunityTeamScreenModel;->id:I

    iget p1, p1, Lcom/whoop/navigation/CommunityTeamScreenModel;->id:I

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lcom/whoop/navigation/CommunityTeamScreenModel;->id:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lcom/whoop/navigation/CommunityTeamScreenModel;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lcom/whoop/navigation/CommunityTeamScreenModel;->id:I

    const-string v1, "CommunityTeamScreenModel(id="

    const-string v2, ")"

    invoke-static {v0, v1, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

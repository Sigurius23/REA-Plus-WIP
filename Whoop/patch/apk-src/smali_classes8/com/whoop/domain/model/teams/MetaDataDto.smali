.class public final Lcom/whoop/domain/model/teams/MetaDataDto;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/domain/model/teams/MetaDataDto$$serializer;,
        Lcom/whoop/domain/model/teams/MetaDataDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u000b\u0008\u0087\u0008\u0018\u0000 02\u00020\u0001:\u000210B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008B3\u0008\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u0007\u0010\u000cJ\'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u0017J\u0010\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J.\u0010!\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010$\u001a\u00020#H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u0017J\u001a\u0010)\u001a\u00020\u00052\u0008\u0010(\u001a\u0004\u0018\u00010\'H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010+\u001a\u0004\u0008,\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010+\u001a\u0004\u0008-\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010.\u001a\u0004\u0008/\u0010 \u00a8\u00062"
    }
    d2 = {
        "Lcom/whoop/domain/model/teams/MetaDataDto;",
        "Landroid/os/Parcelable;",
        "",
        "communityId",
        "memberCount",
        "",
        "deleted",
        "<init>",
        "(IIZ)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IIIZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/domain/model/teams/MetaDataDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "describeContents",
        "()I",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "component1",
        "component2",
        "component3",
        "()Z",
        "copy",
        "(IIZ)Lcom/whoop/domain/model/teams/MetaDataDto;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getCommunityId",
        "getMemberCount",
        "Z",
        "getDeleted",
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
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/whoop/domain/model/teams/MetaDataDto;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/whoop/domain/model/teams/MetaDataDto$Companion;


# instance fields
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

.field private final memberCount:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "member_count"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/domain/model/teams/MetaDataDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/domain/model/teams/MetaDataDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/domain/model/teams/MetaDataDto;->Companion:Lcom/whoop/domain/model/teams/MetaDataDto$Companion;

    new-instance v0, Lcom/whoop/domain/model/teams/MetaDataDto$Creator;

    invoke-direct {v0}, Lcom/whoop/domain/model/teams/MetaDataDto$Creator;-><init>()V

    sput-object v0, Lcom/whoop/domain/model/teams/MetaDataDto;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public synthetic constructor <init>(IIIZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p5, :cond_0

    .line 1
    sget-object p5, Lcom/whoop/domain/model/teams/MetaDataDto$$serializer;->INSTANCE:Lcom/whoop/domain/model/teams/MetaDataDto$$serializer;

    invoke-virtual {p5}, Lcom/whoop/domain/model/teams/MetaDataDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p5

    invoke-static {p1, v0, p5}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/domain/model/teams/MetaDataDto;->communityId:I

    iput p3, p0, Lcom/whoop/domain/model/teams/MetaDataDto;->memberCount:I

    iput-boolean p4, p0, Lcom/whoop/domain/model/teams/MetaDataDto;->deleted:Z

    return-void
.end method

.method public constructor <init>(IIZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/domain/model/teams/MetaDataDto;->communityId:I

    .line 4
    iput p2, p0, Lcom/whoop/domain/model/teams/MetaDataDto;->memberCount:I

    .line 5
    iput-boolean p3, p0, Lcom/whoop/domain/model/teams/MetaDataDto;->deleted:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/domain/model/teams/MetaDataDto;IIZILjava/lang/Object;)Lcom/whoop/domain/model/teams/MetaDataDto;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/whoop/domain/model/teams/MetaDataDto;->communityId:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lcom/whoop/domain/model/teams/MetaDataDto;->memberCount:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-boolean p3, p0, Lcom/whoop/domain/model/teams/MetaDataDto;->deleted:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/domain/model/teams/MetaDataDto;->copy(IIZ)Lcom/whoop/domain/model/teams/MetaDataDto;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/domain/model/teams/MetaDataDto;Lzc3/c;Lyc3/g;)V
    .locals 2

    const/4 v0, 0x0

    iget v1, p0, Lcom/whoop/domain/model/teams/MetaDataDto;->communityId:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x1

    iget v1, p0, Lcom/whoop/domain/model/teams/MetaDataDto;->memberCount:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x2

    iget-boolean p0, p0, Lcom/whoop/domain/model/teams/MetaDataDto;->deleted:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/MetaDataDto;->communityId:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/MetaDataDto;->memberCount:I

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/MetaDataDto;->deleted:Z

    return v0
.end method

.method public final copy(IIZ)Lcom/whoop/domain/model/teams/MetaDataDto;
    .locals 1

    new-instance v0, Lcom/whoop/domain/model/teams/MetaDataDto;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/domain/model/teams/MetaDataDto;-><init>(IIZ)V

    return-object v0
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
    instance-of v1, p1, Lcom/whoop/domain/model/teams/MetaDataDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/domain/model/teams/MetaDataDto;

    iget v1, p0, Lcom/whoop/domain/model/teams/MetaDataDto;->communityId:I

    iget v3, p1, Lcom/whoop/domain/model/teams/MetaDataDto;->communityId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/domain/model/teams/MetaDataDto;->memberCount:I

    iget v3, p1, Lcom/whoop/domain/model/teams/MetaDataDto;->memberCount:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/domain/model/teams/MetaDataDto;->deleted:Z

    iget-boolean p1, p1, Lcom/whoop/domain/model/teams/MetaDataDto;->deleted:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getCommunityId()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/MetaDataDto;->communityId:I

    return v0
.end method

.method public final getDeleted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/MetaDataDto;->deleted:Z

    return v0
.end method

.method public final getMemberCount()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/MetaDataDto;->memberCount:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/whoop/domain/model/teams/MetaDataDto;->communityId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/domain/model/teams/MetaDataDto;->memberCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v1, p0, Lcom/whoop/domain/model/teams/MetaDataDto;->deleted:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lcom/whoop/domain/model/teams/MetaDataDto;->communityId:I

    iget v1, p0, Lcom/whoop/domain/model/teams/MetaDataDto;->memberCount:I

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/MetaDataDto;->deleted:Z

    const-string v3, ", memberCount="

    const-string v4, ", deleted="

    const-string v5, "MetaDataDto(communityId="

    invoke-static {v0, v1, v5, v3, v4}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-static {v0, v2, v1}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p0, Lcom/whoop/domain/model/teams/MetaDataDto;->communityId:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/whoop/domain/model/teams/MetaDataDto;->memberCount:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/whoop/domain/model/teams/MetaDataDto;->deleted:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

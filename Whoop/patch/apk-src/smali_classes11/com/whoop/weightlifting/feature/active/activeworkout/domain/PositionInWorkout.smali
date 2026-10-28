.class public final Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout$$serializer;,
        Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0087\u0008\u0018\u0000 02\u00020\u0001:\u000212B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007B9\u0008\u0010\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u0006\u0010\u000cJ\'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001eJ.\u0010!\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010$\u001a\u00020#H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u0017J\u001a\u0010*\u001a\u00020)2\u0008\u0010(\u001a\u0004\u0018\u00010\'H\u00d6\u0003\u00a2\u0006\u0004\u0008*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010,\u001a\u0004\u0008-\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010,\u001a\u0004\u0008.\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010,\u001a\u0004\u0008/\u0010\u001e\u00a8\u00063"
    }
    d2 = {
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;",
        "Landroid/os/Parcelable;",
        "Ljava/util/UUID;",
        "groupId",
        "exerciseId",
        "setId",
        "<init>",
        "(Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weightlifting_release",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "describeContents",
        "()I",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "component1",
        "()Ljava/util/UUID;",
        "component2",
        "component3",
        "copy",
        "(Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/util/UUID;",
        "getGroupId",
        "getExerciseId",
        "getSetId",
        "Companion",
        "$serializer",
        "a",
        "weightlifting_release"
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

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout$a;


# instance fields
.field private final exerciseId:Ljava/util/UUID;

.field private final groupId:Ljava/util/UUID;

.field private final setId:Ljava/util/UUID;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->Companion:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->$stable:I

    new-instance v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout$b;

    invoke-direct {v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout$b;-><init>()V

    sput-object v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p5, :cond_0

    .line 1
    sget-object p5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout$$serializer;->INSTANCE:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout$$serializer;

    invoke-virtual {p5}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p5

    invoke-static {p1, v0, p5}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->groupId:Ljava/util/UUID;

    iput-object p3, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->exerciseId:Ljava/util/UUID;

    iput-object p4, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->setId:Ljava/util/UUID;

    return-void
.end method

.method public constructor <init>(Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;)V
    .locals 1

    const-string v0, "groupId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exerciseId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->groupId:Ljava/util/UUID;

    .line 4
    iput-object p2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->exerciseId:Ljava/util/UUID;

    .line 5
    iput-object p3, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->setId:Ljava/util/UUID;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;ILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->groupId:Ljava/util/UUID;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->exerciseId:Ljava/util/UUID;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->setId:Ljava/util/UUID;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->copy(Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$weightlifting_release(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Llu2/c;->a:Llu2/c;

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->groupId:Ljava/util/UUID;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->exerciseId:Ljava/util/UUID;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object p0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->setId:Ljava/util/UUID;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->groupId:Ljava/util/UUID;

    return-object v0
.end method

.method public final component2()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->exerciseId:Ljava/util/UUID;

    return-object v0
.end method

.method public final component3()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->setId:Ljava/util/UUID;

    return-object v0
.end method

.method public final copy(Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;
    .locals 1

    const-string v0, "groupId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exerciseId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;-><init>(Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;)V

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
    instance-of v1, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->groupId:Ljava/util/UUID;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->groupId:Ljava/util/UUID;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->exerciseId:Ljava/util/UUID;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->exerciseId:Ljava/util/UUID;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->setId:Ljava/util/UUID;

    iget-object p1, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->setId:Ljava/util/UUID;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getExerciseId()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->exerciseId:Ljava/util/UUID;

    return-object v0
.end method

.method public final getGroupId()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->groupId:Ljava/util/UUID;

    return-object v0
.end method

.method public final getSetId()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->setId:Ljava/util/UUID;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->groupId:Ljava/util/UUID;

    invoke-virtual {v0}, Ljava/util/UUID;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->exerciseId:Ljava/util/UUID;

    invoke-virtual {v1}, Ljava/util/UUID;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->setId:Ljava/util/UUID;

    invoke-virtual {v0}, Ljava/util/UUID;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->groupId:Ljava/util/UUID;

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->exerciseId:Ljava/util/UUID;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->setId:Ljava/util/UUID;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "PositionInWorkout(groupId="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", exerciseId="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", setId="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->groupId:Ljava/util/UUID;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-object p2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->exerciseId:Ljava/util/UUID;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-object p2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->setId:Ljava/util/UUID;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    return-void
.end method

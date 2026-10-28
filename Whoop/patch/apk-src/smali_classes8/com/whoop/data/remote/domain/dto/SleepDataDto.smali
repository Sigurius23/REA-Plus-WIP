.class public final Lcom/whoop/data/remote/domain/dto/SleepDataDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/domain/dto/SleepDataDto$$serializer;,
        Lcom/whoop/data/remote/domain/dto/SleepDataDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 &2\u00020\u0001:\u0002\'&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007B+\u0008\u0010\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u0006\u0010\u000bJ\'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u0016J\u001a\u0010 \u001a\u00020\u00042\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008 \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\"\u001a\u0004\u0008#\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010$\u001a\u0004\u0008%\u0010\u0018\u00a8\u0006("
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/SleepDataDto;",
        "",
        "",
        "recoveryScore",
        "",
        "calibrating",
        "<init>",
        "(IZ)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IIZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/data/remote/domain/dto/SleepDataDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()I",
        "component2",
        "()Z",
        "copy",
        "(IZ)Lcom/whoop/data/remote/domain/dto/SleepDataDto;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getRecoveryScore",
        "Z",
        "getCalibrating",
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
.field public static final Companion:Lcom/whoop/data/remote/domain/dto/SleepDataDto$Companion;


# instance fields
.field private final calibrating:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "calibrating"
    .end annotation
.end field

.field private final recoveryScore:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "recovery_score"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/data/remote/domain/dto/SleepDataDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/dto/SleepDataDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/SleepDataDto;->Companion:Lcom/whoop/data/remote/domain/dto/SleepDataDto$Companion;

    return-void
.end method

.method public synthetic constructor <init>(IIZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p4, :cond_0

    .line 1
    sget-object p4, Lcom/whoop/data/remote/domain/dto/SleepDataDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/SleepDataDto$$serializer;

    invoke-virtual {p4}, Lcom/whoop/data/remote/domain/dto/SleepDataDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p4

    invoke-static {p1, v0, p4}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/data/remote/domain/dto/SleepDataDto;->recoveryScore:I

    iput-boolean p3, p0, Lcom/whoop/data/remote/domain/dto/SleepDataDto;->calibrating:Z

    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/data/remote/domain/dto/SleepDataDto;->recoveryScore:I

    .line 4
    iput-boolean p2, p0, Lcom/whoop/data/remote/domain/dto/SleepDataDto;->calibrating:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/dto/SleepDataDto;IZILjava/lang/Object;)Lcom/whoop/data/remote/domain/dto/SleepDataDto;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lcom/whoop/data/remote/domain/dto/SleepDataDto;->recoveryScore:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-boolean p2, p0, Lcom/whoop/data/remote/domain/dto/SleepDataDto;->calibrating:Z

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/remote/domain/dto/SleepDataDto;->copy(IZ)Lcom/whoop/data/remote/domain/dto/SleepDataDto;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/data/remote/domain/dto/SleepDataDto;Lzc3/c;Lyc3/g;)V
    .locals 2

    const/4 v0, 0x0

    iget v1, p0, Lcom/whoop/data/remote/domain/dto/SleepDataDto;->recoveryScore:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x1

    iget-boolean p0, p0, Lcom/whoop/data/remote/domain/dto/SleepDataDto;->calibrating:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/SleepDataDto;->recoveryScore:I

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/SleepDataDto;->calibrating:Z

    return v0
.end method

.method public final copy(IZ)Lcom/whoop/data/remote/domain/dto/SleepDataDto;
    .locals 1

    new-instance v0, Lcom/whoop/data/remote/domain/dto/SleepDataDto;

    invoke-direct {v0, p1, p2}, Lcom/whoop/data/remote/domain/dto/SleepDataDto;-><init>(IZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/dto/SleepDataDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/dto/SleepDataDto;

    iget v1, p0, Lcom/whoop/data/remote/domain/dto/SleepDataDto;->recoveryScore:I

    iget v3, p1, Lcom/whoop/data/remote/domain/dto/SleepDataDto;->recoveryScore:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/data/remote/domain/dto/SleepDataDto;->calibrating:Z

    iget-boolean p1, p1, Lcom/whoop/data/remote/domain/dto/SleepDataDto;->calibrating:Z

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getCalibrating()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/SleepDataDto;->calibrating:Z

    return v0
.end method

.method public final getRecoveryScore()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/SleepDataDto;->recoveryScore:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/SleepDataDto;->recoveryScore:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/whoop/data/remote/domain/dto/SleepDataDto;->calibrating:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/SleepDataDto;->recoveryScore:I

    iget-boolean v1, p0, Lcom/whoop/data/remote/domain/dto/SleepDataDto;->calibrating:Z

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "SleepDataDto(recoveryScore="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", calibrating="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest$$serializer;,
        Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 ,2\u00020\u0001:\u0002-.B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008B?\u0008\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u0007\u0010\rJ\'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0018J6\u0010\u001c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\u0008\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010%\u0012\u0004\u0008\'\u0010(\u001a\u0004\u0008&\u0010\u0018R \u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010)\u001a\u0004\u0008*\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010%\u001a\u0004\u0008+\u0010\u0018\u00a8\u0006/"
    }
    d2 = {
        "Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;",
        "",
        "",
        "id",
        "",
        "symptoms",
        "notes",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$labrador_release",
        "(Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "copy",
        "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "getId$annotations",
        "()V",
        "Ljava/util/List;",
        "getSymptoms",
        "getNotes",
        "Companion",
        "$serializer",
        "a",
        "labrador_release"
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
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest$a;


# instance fields
.field private final id:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "ecg_reading_id"
    .end annotation
.end field

.field private final notes:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "notes"
    .end annotation
.end field

.field private final symptoms:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "symptoms"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->Companion:Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lqo1/b;

    const/16 v3, 0x17

    invoke-direct {v2, v3}, Lqo1/b;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x3

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p5, :cond_0

    .line 1
    sget-object p5, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest$$serializer;->INSTANCE:Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest$$serializer;

    invoke-virtual {p5}, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p5

    invoke-static {p1, v0, p5}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->symptoms:Ljava/util/List;

    iput-object p4, p0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->notes:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "symptoms"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->symptoms:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->notes:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->symptoms:Ljava/util/List;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->notes:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->copy(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getId$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "ecg_reading_id"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$labrador_release(Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->symptoms:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->notes:Ljava/lang/String;

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->symptoms:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->notes:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "symptoms"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;

    iget-object v1, p0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->symptoms:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->symptoms:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->notes:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->notes:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getNotes()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->notes:Ljava/lang/String;

    return-object v0
.end method

.method public final getSymptoms()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->symptoms:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->symptoms:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->notes:Ljava/lang/String;

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
    .locals 6

    iget-object v0, p0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->symptoms:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;->notes:Ljava/lang/String;

    const-string v3, ", symptoms="

    const-string v4, ", notes="

    const-string v5, "LabradorDetailsSymptomsAndNotesUpdateRequest(id="

    invoke-static {v5, v0, v3, v4, v1}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-static {v2, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

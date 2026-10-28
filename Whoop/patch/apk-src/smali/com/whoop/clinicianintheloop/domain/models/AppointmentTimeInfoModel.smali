.class public final Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel$$serializer;,
        Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u0000 12\u00020\u0001:\u000221B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nBC\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ8\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010(\u001a\u00020\'2\u0008\u0010&\u001a\u0004\u0018\u00010%H\u00d6\u0003\u00a2\u0006\u0004\u0008(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010*\u001a\u0004\u0008+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010,\u001a\u0004\u0008-\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010*\u001a\u0004\u0008.\u0010\u001aR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010/\u001a\u0004\u00080\u0010\u001f\u00a8\u00063"
    }
    d2 = {
        "Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate;",
        "date",
        "time",
        "Lcom/whoop/design/models/items/TagModel;",
        "confirmationTag",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$clinician_in_the_loop_release",
        "(Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate;",
        "component3",
        "component4",
        "()Lcom/whoop/design/models/items/TagModel;",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;)Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate;",
        "getDate",
        "getTime",
        "Lcom/whoop/design/models/items/TagModel;",
        "getConfirmationTag",
        "Companion",
        "$serializer",
        "clinician-in-the-loop_release"
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

.field public static final Companion:Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel$Companion;


# instance fields
.field private final confirmationTag:Lcom/whoop/design/models/items/TagModel;

.field private final date:Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate;

.field private final id:Ljava/lang/String;

.field private final time:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->Companion:Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel$Companion;

    sget v0, Lcom/whoop/design/models/items/TagModel;->$stable:I

    sput v0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel$$serializer;->INSTANCE:Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel$$serializer;

    invoke-virtual {p6}, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->date:Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate;

    iput-object p4, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->time:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->confirmationTag:Lcom/whoop/design/models/items/TagModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "date"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "time"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationTag"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->date:Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate;

    .line 5
    iput-object p3, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->time:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->confirmationTag:Lcom/whoop/design/models/items/TagModel;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;Ljava/lang/String;Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;ILjava/lang/Object;)Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->date:Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->time:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->confirmationTag:Lcom/whoop/design/models/items/TagModel;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->copy(Ljava/lang/String;Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;)Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$clinician_in_the_loop_release(Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate$$serializer;->INSTANCE:Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate$$serializer;

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->date:Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->time:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/TagModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TagModel$$serializer;

    iget-object p0, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->confirmationTag:Lcom/whoop/design/models/items/TagModel;

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->date:Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->time:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/TagModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->confirmationTag:Lcom/whoop/design/models/items/TagModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;)Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "date"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "time"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationTag"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;-><init>(Ljava/lang/String;Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->date:Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->date:Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->time:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->time:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->confirmationTag:Lcom/whoop/design/models/items/TagModel;

    iget-object p1, p1, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->confirmationTag:Lcom/whoop/design/models/items/TagModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getConfirmationTag()Lcom/whoop/design/models/items/TagModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->confirmationTag:Lcom/whoop/design/models/items/TagModel;

    return-object v0
.end method

.method public final getDate()Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->date:Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getTime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->time:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->date:Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate;

    invoke-virtual {v2}, Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->time:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->confirmationTag:Lcom/whoop/design/models/items/TagModel;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/TagModel;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->date:Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate;

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->time:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;->confirmationTag:Lcom/whoop/design/models/items/TagModel;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "AppointmentTimeInfoModel(id="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", date="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", time="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", confirmationTag="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final Lcom/amplitude/android/engagement/types/BeaconMarker;
.super Lcom/amplitude/android/engagement/types/Marker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/amplitude/android/engagement/types/BeaconMarker$$serializer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0087\u0008\u0018\u0000 #2\u00020\u0001:\u0002$%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B%\u0008\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u00c7\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010!\u001a\u0004\u0008\"\u0010\u0014\u00a8\u0006&"
    }
    d2 = {
        "Lcom/amplitude/android/engagement/types/BeaconMarker;",
        "Lcom/amplitude/android/engagement/types/Marker;",
        "Lcom/amplitude/android/engagement/types/MarkerPositioning;",
        "positioning",
        "<init>",
        "(Lcom/amplitude/android/engagement/types/MarkerPositioning;)V",
        "",
        "seen1",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/amplitude/android/engagement/types/MarkerPositioning;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self",
        "(Lcom/amplitude/android/engagement/types/BeaconMarker;Lzc3/c;Lyc3/g;)V",
        "component1",
        "()Lcom/amplitude/android/engagement/types/MarkerPositioning;",
        "copy",
        "(Lcom/amplitude/android/engagement/types/MarkerPositioning;)Lcom/amplitude/android/engagement/types/BeaconMarker;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/amplitude/android/engagement/types/MarkerPositioning;",
        "getPositioning",
        "Companion",
        "$serializer",
        "com/amplitude/android/engagement/types/f",
        "engagement_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/h;
    value = "beacon"
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/amplitude/android/engagement/types/f;


# instance fields
.field private final positioning:Lcom/amplitude/android/engagement/types/MarkerPositioning;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/amplitude/android/engagement/types/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/amplitude/android/engagement/types/BeaconMarker;->Companion:Lcom/amplitude/android/engagement/types/f;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/amplitude/android/engagement/types/MarkerPositioning;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2
    .annotation runtime Ll83/c;
    .end annotation

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x1

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/amplitude/android/engagement/types/BeaconMarker$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/BeaconMarker$$serializer;

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/BeaconMarker$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0, p1, p3}, Lcom/amplitude/android/engagement/types/Marker;-><init>(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V

    iput-object p2, p0, Lcom/amplitude/android/engagement/types/BeaconMarker;->positioning:Lcom/amplitude/android/engagement/types/MarkerPositioning;

    return-void
.end method

.method public constructor <init>(Lcom/amplitude/android/engagement/types/MarkerPositioning;)V
    .locals 1

    const-string v0, "positioning"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/amplitude/android/engagement/types/Marker;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/amplitude/android/engagement/types/BeaconMarker;->positioning:Lcom/amplitude/android/engagement/types/MarkerPositioning;

    return-void
.end method

.method public static synthetic copy$default(Lcom/amplitude/android/engagement/types/BeaconMarker;Lcom/amplitude/android/engagement/types/MarkerPositioning;ILjava/lang/Object;)Lcom/amplitude/android/engagement/types/BeaconMarker;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/amplitude/android/engagement/types/BeaconMarker;->positioning:Lcom/amplitude/android/engagement/types/MarkerPositioning;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/amplitude/android/engagement/types/BeaconMarker;->copy(Lcom/amplitude/android/engagement/types/MarkerPositioning;)Lcom/amplitude/android/engagement/types/BeaconMarker;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self(Lcom/amplitude/android/engagement/types/BeaconMarker;Lzc3/c;Lyc3/g;)V
    .locals 2

    invoke-static {p0, p1, p2}, Lcom/amplitude/android/engagement/types/Marker;->write$Self(Lcom/amplitude/android/engagement/types/Marker;Lzc3/c;Lyc3/g;)V

    sget-object v0, Lcom/amplitude/android/engagement/types/MarkerPositioning$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/MarkerPositioning$$serializer;

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/BeaconMarker;->getPositioning()Lcom/amplitude/android/engagement/types/MarkerPositioning;

    move-result-object p0

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/amplitude/android/engagement/types/MarkerPositioning;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/BeaconMarker;->positioning:Lcom/amplitude/android/engagement/types/MarkerPositioning;

    return-object v0
.end method

.method public final copy(Lcom/amplitude/android/engagement/types/MarkerPositioning;)Lcom/amplitude/android/engagement/types/BeaconMarker;
    .locals 1

    const-string v0, "positioning"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/amplitude/android/engagement/types/BeaconMarker;

    invoke-direct {v0, p1}, Lcom/amplitude/android/engagement/types/BeaconMarker;-><init>(Lcom/amplitude/android/engagement/types/MarkerPositioning;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/amplitude/android/engagement/types/BeaconMarker;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/amplitude/android/engagement/types/BeaconMarker;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/BeaconMarker;->positioning:Lcom/amplitude/android/engagement/types/MarkerPositioning;

    iget-object p1, p1, Lcom/amplitude/android/engagement/types/BeaconMarker;->positioning:Lcom/amplitude/android/engagement/types/MarkerPositioning;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public getPositioning()Lcom/amplitude/android/engagement/types/MarkerPositioning;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/BeaconMarker;->positioning:Lcom/amplitude/android/engagement/types/MarkerPositioning;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/BeaconMarker;->positioning:Lcom/amplitude/android/engagement/types/MarkerPositioning;

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/MarkerPositioning;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "BeaconMarker(positioning="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/BeaconMarker;->positioning:Lcom/amplitude/android/engagement/types/MarkerPositioning;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

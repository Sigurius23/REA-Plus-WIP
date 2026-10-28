.class public final Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/amplitude/android/engagement/AmplitudeInitOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Options"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options$$serializer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0087\u0008\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B%\u0008\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u00c7\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010 \u001a\u0004\u0008!\u0010\u0014\u00a8\u0006%"
    }
    d2 = {
        "Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;",
        "",
        "Lhj/v;",
        "logLevel",
        "<init>",
        "(Lhj/v;)V",
        "",
        "seen1",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILhj/v;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self",
        "(Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;Lzc3/c;Lyc3/g;)V",
        "component1",
        "()Lhj/v;",
        "copy",
        "(Lhj/v;)Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lhj/v;",
        "getLogLevel",
        "Companion",
        "$serializer",
        "com/amplitude/android/engagement/c",
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

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final $childSerializers:[Lwc3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lwc3/c;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/amplitude/android/engagement/c;


# instance fields
.field private final logLevel:Lhj/v;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/amplitude/android/engagement/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;->Companion:Lcom/amplitude/android/engagement/c;

    const-string v0, "com.amplitude.android.engagement.AmplitudeLogLevel"

    invoke-static {}, Lhj/v;->values()[Lhj/v;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lwc3/c;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;->$childSerializers:[Lwc3/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;-><init>(Lhj/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILhj/v;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p1, p1, 0x1

    if-nez p1, :cond_0

    .line 3
    sget-object p1, Lhj/v;->y:Lhj/v;

    .line 4
    iput-object p1, p0, Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;->logLevel:Lhj/v;

    return-void

    :cond_0
    iput-object p2, p0, Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;->logLevel:Lhj/v;

    return-void
.end method

.method public constructor <init>(Lhj/v;)V
    .locals 1

    const-string v0, "logLevel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;->logLevel:Lhj/v;

    return-void
.end method

.method public synthetic constructor <init>(Lhj/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 7
    sget-object p1, Lhj/v;->y:Lhj/v;

    :cond_0
    invoke-direct {p0, p1}, Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;-><init>(Lhj/v;)V

    return-void
.end method

.method public static final synthetic access$get$childSerializers$cp()[Lwc3/c;
    .locals 1

    sget-object v0, Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;->$childSerializers:[Lwc3/c;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;Lhj/v;ILjava/lang/Object;)Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;->logLevel:Lhj/v;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;->copy(Lhj/v;)Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self(Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;->$childSerializers:[Lwc3/c;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;->logLevel:Lhj/v;

    sget-object v3, Lhj/v;->y:Lhj/v;

    if-eq v2, v3, :cond_1

    :goto_0
    aget-object v0, v0, v1

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;->logLevel:Lhj/v;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Lhj/v;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;->logLevel:Lhj/v;

    return-object v0
.end method

.method public final copy(Lhj/v;)Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;
    .locals 1

    const-string v0, "logLevel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;

    invoke-direct {v0, p1}, Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;-><init>(Lhj/v;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;

    iget-object v1, p0, Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;->logLevel:Lhj/v;

    iget-object p1, p1, Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;->logLevel:Lhj/v;

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getLogLevel()Lhj/v;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;->logLevel:Lhj/v;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;->logLevel:Lhj/v;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Options(logLevel="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;->logLevel:Lhj/v;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

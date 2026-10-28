.class public final Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Warmup"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup$$serializer;,
        Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0087\u0008\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B%\u0008\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0004\u0010\nJ\'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003\u00a2\u0006\u0004\u0008 \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\"\u001a\u0004\u0008#\u0010\u0015\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;",
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;",
        "Lorg/joda/time/DateTime;",
        "startTime",
        "<init>",
        "(Lorg/joda/time/DateTime;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILorg/joda/time/DateTime;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weightlifting_release",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lorg/joda/time/DateTime;",
        "copy",
        "(Lorg/joda/time/DateTime;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;",
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
        "Lorg/joda/time/DateTime;",
        "getStartTime",
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
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup$a;


# instance fields
.field private final startTime:Lorg/joda/time/DateTime;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;->Companion:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lno2/a;

    const/16 v2, 0x1b

    invoke-direct {v1, v2}, Lno2/a;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ll83/h;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILorg/joda/time/DateTime;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p3, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p3, :cond_0

    .line 1
    sget-object p3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup$$serializer;->INSTANCE:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup$$serializer;

    invoke-virtual {p3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p3

    invoke-static {p1, v0, p3}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;->startTime:Lorg/joda/time/DateTime;

    return-void
.end method

.method public constructor <init>(Lorg/joda/time/DateTime;)V
    .locals 1

    const-string v0, "startTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;->startTime:Lorg/joda/time/DateTime;

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 4

    new-instance v0, Lwc3/a;

    const-class v1, Lorg/joda/time/DateTime;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lwc3/c;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;Lorg/joda/time/DateTime;ILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;->startTime:Lorg/joda/time/DateTime;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;->copy(Lorg/joda/time/DateTime;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$weightlifting_release(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;Lzc3/c;Lyc3/g;)V
    .locals 2

    sget-object v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;->getStartTime()Lorg/joda/time/DateTime;

    move-result-object p0

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;->startTime:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final copy(Lorg/joda/time/DateTime;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;
    .locals 1

    const-string v0, "startTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;

    invoke-direct {v0, p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;-><init>(Lorg/joda/time/DateTime;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;->startTime:Lorg/joda/time/DateTime;

    iget-object p1, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;->startTime:Lorg/joda/time/DateTime;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public getStartTime()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;->startTime:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;->startTime:Lorg/joda/time/DateTime;

    invoke-virtual {v0}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;->startTime:Lorg/joda/time/DateTime;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Warmup(startTime="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final Lcom/whoop/home/domain/HomeGetRequest;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/network/request/GetApiRequest;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/home/domain/HomeGetRequest$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0010$\n\u0002\u0008\u000b\u0008\u0087\u0008\u0018\u0000 &2\u00020\u0001:\u0001\'B\u0019\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0012\u0010\u0008\u001a\u0004\u0018\u00010\u0002H\u00c2\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004H\u00c2\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000bJ&\u0010\u000c\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u000bJ\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u000e8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001a\u001a\u0004\u0008\u001c\u0010\u0010R&\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u001d8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!R&\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u001d8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u001f\u001a\u0004\u0008#\u0010!R\u0016\u0010%\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010\u0010\u00a8\u0006("
    }
    d2 = {
        "Lcom/whoop/home/domain/HomeGetRequest;",
        "Lcom/whoop/network/request/GetApiRequest;",
        "Ljava/time/LocalDate;",
        "selectedDate",
        "",
        "batteryPercent",
        "<init>",
        "(Ljava/time/LocalDate;I)V",
        "component1",
        "()Ljava/time/LocalDate;",
        "component2",
        "()I",
        "copy",
        "(Ljava/time/LocalDate;I)Lcom/whoop/home/domain/HomeGetRequest;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/time/LocalDate;",
        "I",
        "batteryPercentParam",
        "Ljava/lang/String;",
        "path",
        "getPath",
        "",
        "parameters",
        "Ljava/util/Map;",
        "getParameters",
        "()Ljava/util/Map;",
        "headers",
        "getHeaders",
        "getDateString",
        "dateString",
        "Companion",
        "a",
        "home_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field private static final Companion:Lcom/whoop/home/domain/HomeGetRequest$a;

.field private static final formatter:Ljava/time/format/DateTimeFormatter;


# instance fields
.field private final batteryPercent:I

.field private final batteryPercentParam:Ljava/lang/String;

.field private final headers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final parameters:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final path:Ljava/lang/String;

.field private final selectedDate:Ljava/time/LocalDate;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/home/domain/HomeGetRequest$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/home/domain/HomeGetRequest$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/home/domain/HomeGetRequest;->Companion:Lcom/whoop/home/domain/HomeGetRequest$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/home/domain/HomeGetRequest;->$stable:I

    const-string v0, "yyyy-MM-dd"

    invoke-static {v0}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    const-string v1, "ofPattern(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/whoop/home/domain/HomeGetRequest;->formatter:Ljava/time/format/DateTimeFormatter;

    return-void
.end method

.method public constructor <init>(Ljava/time/LocalDate;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/home/domain/HomeGetRequest;->selectedDate:Ljava/time/LocalDate;

    iput p2, p0, Lcom/whoop/home/domain/HomeGetRequest;->batteryPercent:I

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/home/domain/HomeGetRequest;->batteryPercentParam:Ljava/lang/String;

    const-string p2, "home-service/v1/home"

    iput-object p2, p0, Lcom/whoop/home/domain/HomeGetRequest;->path:Ljava/lang/String;

    invoke-direct {p0}, Lcom/whoop/home/domain/HomeGetRequest;->getDateString()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    const-string v0, "date"

    invoke-static {v0, p2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p2

    goto :goto_0

    :cond_0
    sget-object p2, Lm83/z;->w:Lm83/z;

    :goto_0
    iput-object p2, p0, Lcom/whoop/home/domain/HomeGetRequest;->parameters:Ljava/util/Map;

    const-string p2, "Battery-Level"

    invoke-static {p2, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/home/domain/HomeGetRequest;->headers:Ljava/util/Map;

    return-void
.end method

.method public static final synthetic access$getFormatter$cp()Ljava/time/format/DateTimeFormatter;
    .locals 1

    sget-object v0, Lcom/whoop/home/domain/HomeGetRequest;->formatter:Ljava/time/format/DateTimeFormatter;

    return-object v0
.end method

.method private final component1()Ljava/time/LocalDate;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/HomeGetRequest;->selectedDate:Ljava/time/LocalDate;

    return-object v0
.end method

.method private final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/home/domain/HomeGetRequest;->batteryPercent:I

    return v0
.end method

.method public static synthetic copy$default(Lcom/whoop/home/domain/HomeGetRequest;Ljava/time/LocalDate;IILjava/lang/Object;)Lcom/whoop/home/domain/HomeGetRequest;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/whoop/home/domain/HomeGetRequest;->selectedDate:Ljava/time/LocalDate;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget p2, p0, Lcom/whoop/home/domain/HomeGetRequest;->batteryPercent:I

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/home/domain/HomeGetRequest;->copy(Ljava/time/LocalDate;I)Lcom/whoop/home/domain/HomeGetRequest;

    move-result-object p0

    return-object p0
.end method

.method private final getDateString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/whoop/home/domain/HomeGetRequest;->selectedDate:Ljava/time/LocalDate;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/whoop/home/domain/HomeGetRequest;->formatter:Ljava/time/format/DateTimeFormatter;

    invoke-virtual {v0, v1}, Ljava/time/LocalDate;->format(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public final copy(Ljava/time/LocalDate;I)Lcom/whoop/home/domain/HomeGetRequest;
    .locals 1

    new-instance v0, Lcom/whoop/home/domain/HomeGetRequest;

    invoke-direct {v0, p1, p2}, Lcom/whoop/home/domain/HomeGetRequest;-><init>(Ljava/time/LocalDate;I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/home/domain/HomeGetRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/home/domain/HomeGetRequest;

    iget-object v1, p0, Lcom/whoop/home/domain/HomeGetRequest;->selectedDate:Ljava/time/LocalDate;

    iget-object v3, p1, Lcom/whoop/home/domain/HomeGetRequest;->selectedDate:Ljava/time/LocalDate;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/home/domain/HomeGetRequest;->batteryPercent:I

    iget p1, p1, Lcom/whoop/home/domain/HomeGetRequest;->batteryPercent:I

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public bridge synthetic getBody()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/whoop/home/domain/HomeGetRequest;->getBody()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public bridge getBody()Ljava/lang/Void;
    .locals 1

    .line 2
    invoke-super {p0}, Lcom/whoop/network/request/GetApiRequest;->getBody()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public bridge getHasBody()Z
    .locals 1

    invoke-super {p0}, Lcom/whoop/network/request/GetApiRequest;->getHasBody()Z

    move-result v0

    return v0
.end method

.method public getHeaders()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/home/domain/HomeGetRequest;->headers:Ljava/util/Map;

    return-object v0
.end method

.method public bridge getHttpTimeoutConfig()Lcom/whoop/network/request/HttpTimeoutConfig;
    .locals 1

    invoke-super {p0}, Lcom/whoop/network/request/GetApiRequest;->getHttpTimeoutConfig()Lcom/whoop/network/request/HttpTimeoutConfig;

    move-result-object v0

    return-object v0
.end method

.method public bridge getMethod()Li63/t;
    .locals 1

    invoke-super {p0}, Lcom/whoop/network/request/GetApiRequest;->getMethod()Li63/t;

    move-result-object v0

    return-object v0
.end method

.method public getParameters()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/home/domain/HomeGetRequest;->parameters:Ljava/util/Map;

    return-object v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/HomeGetRequest;->path:Ljava/lang/String;

    return-object v0
.end method

.method public bridge getTag()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lcom/whoop/network/request/GetApiRequest;->getTag()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/home/domain/HomeGetRequest;->selectedDate:Ljava/time/LocalDate;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/time/LocalDate;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/whoop/home/domain/HomeGetRequest;->batteryPercent:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/whoop/home/domain/HomeGetRequest;->selectedDate:Ljava/time/LocalDate;

    iget v1, p0, Lcom/whoop/home/domain/HomeGetRequest;->batteryPercent:I

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "HomeGetRequest(selectedDate="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", batteryPercent="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge url(Lsr2/y;)Ljava/lang/String;
    .locals 0

    invoke-super {p0, p1}, Lcom/whoop/network/request/GetApiRequest;->url(Lsr2/y;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

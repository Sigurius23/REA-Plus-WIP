.class public final Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;
.super Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Error"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017H\u00d6\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;",
        "error",
        "",
        "date",
        "errorType",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;)V",
        "getError",
        "()Ljava/lang/String;",
        "getDate",
        "getErrorType",
        "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "hormonal-insights_release"
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


# instance fields
.field private final date:Ljava/lang/String;

.field private final error:Ljava/lang/String;

.field private final errorType:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "date"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;->error:Ljava/lang/String;

    iput-object p2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;->date:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;->errorType:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 2
    sget-object p3, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;->GENERIC_ERROR:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;ILjava/lang/Object;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;->error:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;->date:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;->errorType:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;->error:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;->date:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;->errorType:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "date"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;->error:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;->error:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;->date:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;->date:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;->errorType:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;

    iget-object p1, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;->errorType:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getDate()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;->date:Ljava/lang/String;

    return-object v0
.end method

.method public final getError()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;->error:Ljava/lang/String;

    return-object v0
.end method

.method public final getErrorType()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;->errorType:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;->error:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;->date:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;->errorType:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;->error:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;->date:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;->errorType:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;

    const-string v3, ", date="

    const-string v4, ", errorType="

    const-string v5, "Error(error="

    invoke-static {v5, v0, v3, v1, v4}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

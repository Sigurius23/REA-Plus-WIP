.class public abstract Loy2/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a7\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "",
        "currentStep",
        "Lorg/joda/time/DateTime;",
        "lastStepTime",
        "",
        "Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;",
        "steps",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "Loy2/p;",
        "a",
        "(ILorg/joda/time/DateTime;Ljava/util/List;Lzr2/a;)Loy2/p;",
        "whooplabs_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(ILorg/joda/time/DateTime;Ljava/util/List;Lzr2/a;)Loy2/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lorg/joda/time/DateTime;",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;",
            ">;",
            "Lzr2/a;",
            ")",
            "Loy2/p;"
        }
    .end annotation

    const-string v0, "steps"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateAndTimeProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->getProtocolStep()Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isTimerActive()Ljava/lang/Boolean;

    move-result-object p2

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    sget-object p0, Loy2/p$b;->a:Loy2/p$b;

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isCountDownTimerRequired()Z

    move-result p2

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getCountDownTimerSeconds()Ljava/lang/Integer;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    goto :goto_0

    :cond_1
    move p0, v0

    :goto_0
    if-nez p1, :cond_2

    invoke-interface {p3}, Lzr2/a;->c()Lorg/joda/time/DateTime;

    move-result-object p1

    :cond_2
    invoke-interface {p3}, Lzr2/a;->c()Lorg/joda/time/DateTime;

    move-result-object p3

    invoke-static {p1, p3}, Lorg/joda/time/Seconds;->secondsBetween(Lorg/joda/time/ReadableInstant;Lorg/joda/time/ReadableInstant;)Lorg/joda/time/Seconds;

    move-result-object p3

    invoke-virtual {p3}, Lorg/joda/time/Seconds;->getSeconds()I

    move-result p3

    if-eqz p2, :cond_3

    sub-int/2addr p0, p3

    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    move-result p3

    :cond_3
    new-instance p0, Loy2/p$a;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p0, p3, p2, p1}, Loy2/p$a;-><init>(Ljava/lang/Integer;ZLorg/joda/time/DateTime;)V

    return-object p0
.end method

.class public final Lff2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ \u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0082@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0016\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010H\u0086@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lff2/a;",
        "",
        "Lci2/b;",
        "whoopStrapProvider",
        "Lqf2/f;",
        "smartAlarmRepository",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lci2/b;Lqf2/f;Ltr2/n;)V",
        "",
        "enabling",
        "Lorg/joda/time/Instant;",
        "alarmInstant",
        "b",
        "(ZLorg/joda/time/Instant;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/data/remote/commons/Resource;",
        "Ll83/a0;",
        "c",
        "(Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lci2/b;",
        "Lqf2/f;",
        "Ltr2/n;",
        "sleep-coach_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lci2/b;

.field private final b:Lqf2/f;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lci2/b;Lqf2/f;Ltr2/n;)V
    .locals 1

    const-string v0, "whoopStrapProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "smartAlarmRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lff2/a;->a:Lci2/b;

    iput-object p2, p0, Lff2/a;->b:Lqf2/f;

    iput-object p3, p0, Lff2/a;->c:Ltr2/n;

    return-void
.end method

.method public static final synthetic a(Lff2/a;ZLorg/joda/time/Instant;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lff2/a;->b(ZLorg/joda/time/Instant;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final b(ZLorg/joda/time/Instant;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lorg/joda/time/Instant;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lff2/a$a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lff2/a$a;

    iget v1, v0, Lff2/a$a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lff2/a$a;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lff2/a$a;

    invoke-direct {v0, p0, p3}, Lff2/a$a;-><init>(Lff2/a;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lff2/a$a;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lff2/a$a;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lff2/a$a;->x:Ljava/lang/Object;

    check-cast p1, Lorg/joda/time/Instant;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lff2/a$a;->x:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lorg/joda/time/Instant;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz p1, :cond_5

    iget-object p3, p0, Lff2/a;->b:Lqf2/f;

    iput-object p2, v0, Lff2/a$a;->x:Ljava/lang/Object;

    iput-boolean p1, v0, Lff2/a$a;->w:Z

    iput v4, v0, Lff2/a$a;->E:I

    invoke-virtual {p3, p2, v0}, Lqf2/f;->r(Lorg/joda/time/Instant;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object p3, p0, Lff2/a;->c:Ltr2/n;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "is alarm set : "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " and time as : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p3, p2, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_5
    iget-object p2, p0, Lff2/a;->b:Lqf2/f;

    const/4 p3, 0x0

    iput-object p3, v0, Lff2/a$a;->x:Ljava/lang/Object;

    iput-boolean p1, v0, Lff2/a$a;->w:Z

    iput v3, v0, Lff2/a$a;->E:I

    invoke-virtual {p2, v0}, Lqf2/f;->disableAlarmOnStrap(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    return-object p1
.end method


# virtual methods
.method public final c(Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/commons/Resource<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lff2/a$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lff2/a$b;

    iget v1, v0, Lff2/a$b;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lff2/a$b;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lff2/a$b;

    invoke-direct {v0, p0, p1}, Lff2/a$b;-><init>(Lff2/a;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lff2/a$b;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lff2/a$b;->F:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x2

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v5, :cond_1

    iget-object v1, v0, Lff2/a$b;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    iget-object v0, v0, Lff2/a$b;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lff2/a;->b:Lqf2/f;

    iput v4, v0, Lff2/a$b;->F:I

    invoke-virtual {p1, v0}, Lqf2/f;->l(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getSmartAlarmEnabled()Z

    move-result v2

    invoke-virtual {p1}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getUpperBoundLocalTime()Lorg/joda/time/LocalTime;

    move-result-object p1

    invoke-static {p1, v6, v5, v6}, Ltf2/a;->b(Lorg/joda/time/LocalTime;Lorg/joda/time/DateTime;ILjava/lang/Object;)Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-virtual {p1}, Lorg/joda/time/base/AbstractInstant;->toInstant()Lorg/joda/time/Instant;

    move-result-object p1

    const-string v4, "toInstant(...)"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v6, v0, Lff2/a$b;->w:Ljava/lang/Object;

    iput-object v6, v0, Lff2/a$b;->x:Ljava/lang/Object;

    iput v3, v0, Lff2/a$b;->y:I

    iput v5, v0, Lff2/a$b;->F:I

    invoke-direct {p0, v2, p1, v0}, Lff2/a;->b(ZLorg/joda/time/Instant;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lff2/a;->a:Lci2/b;

    invoke-static {v0}, Lih0/d0;->h(Lci2/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljk0/d;

    iget-object v1, p0, Lff2/a;->c:Ltr2/n;

    if-eqz v0, :cond_6

    invoke-interface {v0}, Ljk0/d;->w0()Lst0/v;

    move-result-object v0

    if-eqz v0, :cond_6

    sget-object v2, Lst0/v;->Companion:Lst0/v$a;

    invoke-virtual {v2, v0}, Lst0/v$a;->b(Lst0/v;)Ljava/lang/String;

    move-result-object v6

    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "strap status "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, " and is strap: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v3, [Lqr2/a$a;

    invoke-interface {v1, v0, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    if-eqz p1, :cond_7

    sget-object p1, Lcom/whoop/data/remote/commons/Resource;->Companion:Lcom/whoop/data/remote/commons/Resource$Companion;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lcom/whoop/data/remote/commons/Resource$Companion;->success(Ljava/lang/Object;)Lcom/whoop/data/remote/commons/Resource;

    move-result-object p1

    goto :goto_4

    :cond_7
    sget-object v0, Lcom/whoop/data/remote/commons/Resource;->Companion:Lcom/whoop/data/remote/commons/Resource$Companion;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const-string v1, "Strap failure"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lcom/whoop/data/remote/commons/Resource$Companion;->error$default(Lcom/whoop/data/remote/commons/Resource$Companion;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Lcom/whoop/network/exception/DomainException;ILjava/lang/Object;)Lcom/whoop/data/remote/commons/Resource;

    move-result-object p1

    :goto_4
    if-nez p1, :cond_8

    goto :goto_5

    :cond_8
    return-object p1

    :cond_9
    :goto_5
    sget-object v0, Lcom/whoop/data/remote/commons/Resource;->Companion:Lcom/whoop/data/remote/commons/Resource$Companion;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const-string v1, "Cannot fetch Smart alarm preferences"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lcom/whoop/data/remote/commons/Resource$Companion;->error$default(Lcom/whoop/data/remote/commons/Resource$Companion;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Lcom/whoop/network/exception/DomainException;ILjava/lang/Object;)Lcom/whoop/data/remote/commons/Resource;

    move-result-object p1

    return-object p1
.end method

.class final Lql1/a$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lql1/a;-><init>(La6/g;Ljava/time/Clock;Lql1/c;Ltd1/b;Lql1/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/n;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "",
        "dismissedDate",
        "",
        "isCharging",
        "",
        "batteryPercentageByte",
        "Lql1/d;",
        "<anonymous>",
        "(Ljava/lang/String;ZB)Lql1/d;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.home.domain.connectivity.lowbattery.LowBatteryAlertHelper$showLowBatteryStateFlow$1"
    f = "LowBatteryAlertHelper.kt"
    l = {
        0x29
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Z

.field synthetic F:B

.field final synthetic G:Lql1/a;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lql1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lql1/a;",
            "Lq83/d<",
            "-",
            "Lql1/a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lql1/a$b;->G:Lql1/a;

    const/4 p1, 0x4

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/String;ZBLq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "ZB",
            "Lq83/d<",
            "-",
            "Lql1/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lql1/a$b;

    iget-object v1, p0, Lql1/a$b;->G:Lql1/a;

    invoke-direct {v0, v1, p4}, Lql1/a$b;-><init>(Lql1/a;Lq83/d;)V

    iput-object p1, v0, Lql1/a$b;->z:Ljava/lang/Object;

    iput-boolean p2, v0, Lql1/a$b;->E:Z

    iput-byte p3, v0, Lql1/a$b;->F:B

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lql1/a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->byteValue()B

    move-result p3

    check-cast p4, Lq83/d;

    invoke-virtual {p0, p1, p2, p3, p4}, Lql1/a$b;->f(Ljava/lang/String;ZBLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lql1/a$b;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-boolean v1, p0, Lql1/a$b;->E:Z

    iget-byte v2, p0, Lql1/a$b;->F:B

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, p0, Lql1/a$b;->y:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v4, :cond_1

    if-ne v4, v6, :cond_0

    iget-object v3, p0, Lql1/a$b;->x:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v4, p0, Lql1/a$b;->w:Ljava/lang/Object;

    check-cast v4, Ljava/time/format/DateTimeFormatter;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p1, "MM-dd-yyyy"

    invoke-static {p1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object p1

    iget-object v4, p0, Lql1/a$b;->G:Lql1/a;

    invoke-static {v4}, Lql1/a;->b(Lql1/a;)Ljava/time/Clock;

    move-result-object v4

    invoke-static {v4}, Ljava/time/LocalDate;->now(Ljava/time/Clock;)Ljava/time/LocalDate;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/time/LocalDate;->format(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;

    move-result-object p1

    iget-object v4, p0, Lql1/a$b;->G:Lql1/a;

    invoke-static {v4}, Lql1/a;->c(Lql1/a;)La6/g;

    move-result-object v4

    invoke-interface {v4}, La6/g;->getData()Lec3/l;

    move-result-object v4

    iput-object v0, p0, Lql1/a$b;->z:Ljava/lang/Object;

    iput-object v5, p0, Lql1/a$b;->w:Ljava/lang/Object;

    iput-object p1, p0, Lql1/a$b;->x:Ljava/lang/Object;

    iput-boolean v1, p0, Lql1/a$b;->E:Z

    iput-byte v2, p0, Lql1/a$b;->F:B

    iput v6, p0, Lql1/a$b;->y:I

    invoke-static {v4, p0}, Lec3/v;->C(Lec3/l;Ls83/c;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_2

    return-object v3

    :cond_2
    move-object v3, p1

    move-object p1, v4

    :goto_0
    check-cast p1, Lf6/f;

    if-eqz p1, :cond_3

    invoke-static {}, Lql1/a;->f()Lf6/d;

    move-result-object v4

    invoke-virtual {p1, v4}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_4

    :cond_3
    const-string p1, ""

    :cond_4
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    const-string v4, "%"

    if-nez p1, :cond_6

    const/16 p1, 0xa

    if-gt v2, p1, :cond_6

    if-nez v1, :cond_6

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    iget-object p1, p0, Lql1/a$b;->G:Lql1/a;

    invoke-static {p1}, Lql1/a;->e(Lql1/a;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    iget-object p1, p0, Lql1/a$b;->G:Lql1/a;

    invoke-static {p1}, Lql1/a;->a(Lql1/a;)Lql1/b;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lql1/b;->b(Ljava/lang/String;)V

    iget-object p1, p0, Lql1/a$b;->G:Lql1/a;

    invoke-static {p1, v3}, Lql1/a;->h(Lql1/a;Ljava/lang/String;)V

    :cond_5
    new-instance p1, Lql1/d;

    invoke-direct {p1, v6, v2}, Lql1/d;-><init>(ZI)V

    return-object p1

    :cond_6
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lql1/a$b;->G:Lql1/a;

    invoke-static {p1}, Lql1/a;->d(Lql1/a;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    iget-object p1, p0, Lql1/a$b;->G:Lql1/a;

    invoke-static {p1}, Lql1/a;->a(Lql1/a;)Lql1/b;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lql1/b;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lql1/a$b;->G:Lql1/a;

    invoke-static {p1, v3}, Lql1/a;->g(Lql1/a;Ljava/lang/String;)V

    :cond_7
    new-instance p1, Lql1/d;

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p1, v1, v1, v0, v5}, Lql1/d;-><init>(ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

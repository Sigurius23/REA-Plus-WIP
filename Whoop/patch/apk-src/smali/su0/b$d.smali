.class final Lsu0/b$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsu0/b;->e()Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "level",
        "",
        "isCharging",
        "Ll83/a0;",
        "<anonymous>",
        "(BZ)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.connectivityNotifications.deadbattery.DeadBatteryNotificationMonitorImpl$handleBatteryReadings$1$1"
    f = "DeadBatteryNotificationMonitorImpl.kt"
    l = {
        0x3b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:I

.field final synthetic F:I

.field w:I

.field synthetic x:B

.field synthetic y:Z

.field final synthetic z:Lsu0/b;


# direct methods
.method public constructor <init>(Lsu0/b;IILq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsu0/b;",
            "II",
            "Lq83/d<",
            "-",
            "Lsu0/b$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsu0/b$d;->z:Lsu0/b;

    iput p2, p0, Lsu0/b$d;->E:I

    iput p3, p0, Lsu0/b$d;->F:I

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(BZLq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(BZ",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lsu0/b$d;

    iget-object v1, p0, Lsu0/b$d;->z:Lsu0/b;

    iget v2, p0, Lsu0/b$d;->E:I

    iget v3, p0, Lsu0/b$d;->F:I

    invoke-direct {v0, v1, v2, v3, p3}, Lsu0/b$d;-><init>(Lsu0/b;IILq83/d;)V

    iput-byte p1, v0, Lsu0/b$d;->x:B

    iput-boolean p2, v0, Lsu0/b$d;->y:Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lsu0/b$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result p1

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lsu0/b$d;->f(BZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-byte v0, p0, Lsu0/b$d;->x:B

    iget-boolean v3, p0, Lsu0/b$d;->y:Z

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lsu0/b$d;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, p0, Lsu0/b$d;->z:Lsu0/b;

    move p1, v2

    int-to-byte v2, v0

    iget v4, p0, Lsu0/b$d;->E:I

    iget v5, p0, Lsu0/b$d;->F:I

    iput-byte v0, p0, Lsu0/b$d;->x:B

    iput-boolean v3, p0, Lsu0/b$d;->y:Z

    iput p1, p0, Lsu0/b$d;->w:I

    move-object v6, p0

    invoke-static/range {v1 .. v6}, Lsu0/b;->a(Lsu0/b;BZIILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v7, :cond_2

    return-object v7

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

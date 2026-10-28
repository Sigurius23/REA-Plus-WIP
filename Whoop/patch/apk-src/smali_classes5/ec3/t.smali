.class public final Lec3/t;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:J


# direct methods
.method public constructor <init>(JLq83/d;)V
    .locals 0

    iput-wide p1, p0, Lec3/t;->w:J

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3

    new-instance v0, Lec3/t;

    iget-wide v1, p0, Lec3/t;->w:J

    invoke-direct {v0, v1, v2, p1}, Lec3/t;-><init>(JLq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lec3/t;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lec3/t;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lec3/t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    throw p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lkotlinx/coroutines/TimeoutCancellationException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Timed out waiting for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lec3/t;->w:J

    invoke-static {v1, v2}, Lkotlin/time/Duration;->toString-impl(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lkotlinx/coroutines/TimeoutCancellationException;-><init>(Ljava/lang/String;Lbc3/k1;)V

    throw p1
.end method

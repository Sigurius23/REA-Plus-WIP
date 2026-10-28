.class public final Ld33/s0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic E:Ljava/util/Map;

.field public final synthetic F:Ld33/h1;

.field public final synthetic G:Ljava/lang/String;

.field public w:I

.field public x:I

.field public synthetic y:Ljava/lang/Throwable;

.field public synthetic z:J


# direct methods
.method public constructor <init>(Ljava/util/Map;Ld33/h1;Ljava/lang/String;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Ld33/s0;->E:Ljava/util/Map;

    iput-object p2, p0, Ld33/s0;->F:Ld33/h1;

    iput-object p3, p0, Ld33/s0;->G:Ljava/lang/String;

    const/4 p1, 0x4

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    check-cast p1, Lec3/m;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    check-cast p4, Lq83/d;

    new-instance p1, Ld33/s0;

    iget-object p3, p0, Ld33/s0;->F:Ld33/h1;

    iget-object v2, p0, Ld33/s0;->G:Ljava/lang/String;

    iget-object v3, p0, Ld33/s0;->E:Ljava/util/Map;

    invoke-direct {p1, v3, p3, v2, p4}, Ld33/s0;-><init>(Ljava/util/Map;Ld33/h1;Ljava/lang/String;Lq83/d;)V

    iput-object p2, p1, Ld33/s0;->y:Ljava/lang/Throwable;

    iput-wide v0, p1, Ld33/s0;->z:J

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld33/s0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ld33/s0;->x:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    iget v0, p0, Ld33/s0;->w:I

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld33/s0;->y:Ljava/lang/Throwable;

    iget-wide v4, p0, Ld33/s0;->z:J

    instance-of v1, p1, Lio/getstream/video/android/core/call/utils/SessionFatalException;

    if-eqz v1, :cond_2

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_2
    iget-object v1, p0, Ld33/s0;->F:Ld33/h1;

    iget-object v6, v1, Ld33/h1;->M:Lec3/h2;

    invoke-virtual {v6}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v6

    iget-object v7, p0, Ld33/s0;->E:Ljava/util/Map;

    invoke-virtual {v7, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    iget-object v7, p0, Ld33/s0;->G:Ljava/lang/String;

    iget-object v8, v1, Ld33/h1;->e:Ljava/lang/String;

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v6, :cond_3

    if-eqz v7, :cond_3

    const-wide/16 v6, 0x1e

    cmp-long v6, v4, v6

    if-gez v6, :cond_3

    move v6, v3

    goto :goto_0

    :cond_3
    move v6, v2

    :goto_0
    const-wide/16 v7, 0x1

    cmp-long v7, v4, v7

    if-gtz v7, :cond_4

    const-wide/16 v7, 0x64

    goto :goto_1

    :cond_4
    const-wide/16 v7, 0x3

    cmp-long v7, v4, v7

    if-gtz v7, :cond_5

    const-wide/16 v7, 0x12c

    goto :goto_1

    :cond_5
    const-wide/16 v7, 0x9c4

    :goto_1
    invoke-virtual {v1}, Ld33/h1;->s()Lb23/k;

    move-result-object v1

    iget-object v9, v1, Lb23/k;->c:Lb23/e;

    iget-object v10, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v11, Lb23/g;->E:Lb23/g;

    invoke-interface {v9, v11, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_6

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v12, "updating mute state failed with error "

    invoke-direct {v9, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", retry attempt: "

    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ". will retry "

    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, " in "

    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " ms"

    invoke-static {v7, v8, p1, v9}, Ld;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    const/4 v4, 0x0

    invoke-interface {v1, v11, v10, p1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    iput v6, p0, Ld33/s0;->w:I

    iput v3, p0, Ld33/s0;->x:I

    invoke-static {v7, v8, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    move v0, v6

    :goto_2
    if-eqz v0, :cond_8

    move v2, v3

    :cond_8
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

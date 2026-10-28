.class public final Lpg3/t;
.super Lpg3/v;
.source "SourceFile"


# instance fields
.field public final d:Lpg3/g;

.field public final e:Z


# direct methods
.method public constructor <init>(Lpg3/u0;Lud3/i;Lpg3/n;Lpg3/g;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lpg3/v;-><init>(Lpg3/u0;Lud3/i;Lpg3/n;)V

    iput-object p4, p0, Lpg3/t;->d:Lpg3/g;

    iput-boolean p5, p0, Lpg3/t;->e:Z

    return-void
.end method


# virtual methods
.method public final a(Lpg3/b0;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpg3/t;->d:Lpg3/g;

    invoke-interface {v0, p1}, Lpg3/g;->adapt(Lpg3/e;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpg3/e;

    array-length v0, p2

    add-int/lit8 v0, v0, -0x1

    aget-object p2, p2, v0

    check-cast p2, Lq83/d;

    :try_start_0
    iget-boolean v0, p0, Lpg3/t;->e:Z

    if-eqz v0, :cond_0

    const-string v0, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lpg3/e1;->c(Lpg3/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1, p2}, Lpg3/e1;->b(Lpg3/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/VirtualMachineError; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/LinkageError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    goto :goto_1

    :goto_0
    invoke-static {p1, p2}, Lpg3/e1;->q(Ljava/lang/Throwable;Lq83/d;)V

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :goto_1
    throw p1
.end method

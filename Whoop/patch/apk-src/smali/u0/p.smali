.class public final synthetic Lu0/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic E:Ly3/c;

.field public final synthetic F:Lp3/h;

.field public final synthetic w:Ll3/v0;

.field public final synthetic x:Ly3/m;

.field public final synthetic y:Ljava/util/List;

.field public final synthetic z:Ll3/g;


# direct methods
.method public synthetic constructor <init>(Ll3/v0;Ly3/m;Ljava/util/List;Ll3/g;Ly3/c;Lp3/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/p;->w:Ll3/v0;

    iput-object p2, p0, Lu0/p;->x:Ly3/m;

    iput-object p3, p0, Lu0/p;->y:Ljava/util/List;

    iput-object p4, p0, Lu0/p;->z:Ll3/g;

    iput-object p5, p0, Lu0/p;->E:Ly3/c;

    iput-object p6, p0, Lu0/p;->F:Lp3/h;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    iget-object v0, p0, Lu0/p;->w:Ll3/v0;

    iget-object v1, p0, Lu0/p;->x:Ly3/m;

    iget-object v3, p0, Lu0/p;->z:Ll3/g;

    iget-object v6, p0, Lu0/p;->E:Ly3/c;

    iget-object v7, p0, Lu0/p;->F:Lp3/h;

    const-string v2, "BackgroundTextMeasurement"

    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v2

    instance-of v4, v2, Lz1/b;

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    check-cast v2, Lz1/b;

    goto :goto_0

    :cond_0
    move-object v2, v5

    :goto_0
    if-eqz v2, :cond_2

    invoke-virtual {v2, v5, v5}, Lz1/b;->C(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lz1/b;

    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v8, :cond_2

    :try_start_1
    invoke-virtual {v8}, Lz1/f;->j()Lz1/f;

    move-result-object v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    invoke-static {v0, v1}, Ljc/x;->p0(Ll3/v0;Ly3/m;)Ll3/v0;

    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v0, p0, Lu0/p;->y:Ljava/util/List;

    if-nez v0, :cond_1

    :try_start_3
    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_1
    move-object v5, v0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :goto_1
    new-instance v2, Laa3/i1;

    invoke-direct/range {v2 .. v7}, Laa3/i1;-><init>(Ll3/g;Ll3/v0;Ljava/util/List;Ly3/c;Lp3/h;)V

    invoke-virtual {v2}, Laa3/i1;->c()F
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-static {v9}, Lz1/f;->q(Lz1/f;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    invoke-virtual {v8}, Lz1/b;->w()Lz1/q;

    move-result-object v0

    invoke-virtual {v0}, Lz1/q;->d()V

    invoke-virtual {v8}, Lz1/b;->c()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :catchall_1
    move-exception v0

    goto :goto_4

    :catchall_2
    move-exception v0

    goto :goto_3

    :goto_2
    :try_start_6
    invoke-static {v9}, Lz1/f;->q(Lz1/f;)V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :goto_3
    :try_start_7
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :catchall_3
    move-exception v0

    :try_start_8
    invoke-virtual {v8}, Lz1/b;->c()V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot create a mutable snapshot of an read-only snapshot"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :goto_4
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0
.end method

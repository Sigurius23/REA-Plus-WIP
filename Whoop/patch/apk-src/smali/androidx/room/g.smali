.class public final Landroidx/room/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Lub/d;

.field public final d:Landroidx/room/t0;

.field public final e:Ljava/util/List;

.field public final f:Z

.field public final g:Landroidx/room/s0;

.field public final h:Ljava/util/concurrent/Executor;

.field public final i:Ljava/util/concurrent/Executor;

.field public final j:Landroid/content/Intent;

.field public final k:Z

.field public final l:Z

.field public final m:Ljava/util/Set;

.field public final n:Ljava/lang/String;

.field public final o:Ljava/io/File;

.field public final p:Ljava/util/concurrent/Callable;

.field public final q:Ljava/util/List;

.field public final r:Ljava/util/List;

.field public final s:Z

.field public final t:Ltb/b;

.field public final u:Lq83/j;

.field public v:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lub/d;Landroidx/room/t0;Ljava/util/List;ZLandroidx/room/s0;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Ljava/util/List;Ljava/util/List;ZLtb/b;Lq83/j;)V
    .locals 3

    move-object/from16 v0, p17

    move-object/from16 v1, p18

    const-string v2, "context"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "migrationContainer"

    invoke-static {p4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "queryExecutor"

    invoke-static {p8, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "transactionExecutor"

    invoke-static {p9, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "typeConverters"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "autoMigrationSpecs"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/g;->a:Landroid/content/Context;

    iput-object p2, p0, Landroidx/room/g;->b:Ljava/lang/String;

    iput-object p3, p0, Landroidx/room/g;->c:Lub/d;

    iput-object p4, p0, Landroidx/room/g;->d:Landroidx/room/t0;

    iput-object p5, p0, Landroidx/room/g;->e:Ljava/util/List;

    iput-boolean p6, p0, Landroidx/room/g;->f:Z

    iput-object p7, p0, Landroidx/room/g;->g:Landroidx/room/s0;

    iput-object p8, p0, Landroidx/room/g;->h:Ljava/util/concurrent/Executor;

    iput-object p9, p0, Landroidx/room/g;->i:Ljava/util/concurrent/Executor;

    iput-object p10, p0, Landroidx/room/g;->j:Landroid/content/Intent;

    iput-boolean p11, p0, Landroidx/room/g;->k:Z

    iput-boolean p12, p0, Landroidx/room/g;->l:Z

    move-object/from16 p1, p13

    iput-object p1, p0, Landroidx/room/g;->m:Ljava/util/Set;

    move-object/from16 p1, p14

    iput-object p1, p0, Landroidx/room/g;->n:Ljava/lang/String;

    move-object/from16 p1, p15

    iput-object p1, p0, Landroidx/room/g;->o:Ljava/io/File;

    move-object/from16 p1, p16

    iput-object p1, p0, Landroidx/room/g;->p:Ljava/util/concurrent/Callable;

    iput-object v0, p0, Landroidx/room/g;->q:Ljava/util/List;

    iput-object v1, p0, Landroidx/room/g;->r:Ljava/util/List;

    move/from16 p1, p19

    iput-boolean p1, p0, Landroidx/room/g;->s:Z

    move-object/from16 p1, p20

    iput-object p1, p0, Landroidx/room/g;->t:Ltb/b;

    move-object/from16 p1, p21

    iput-object p1, p0, Landroidx/room/g;->u:Lq83/j;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/room/g;->v:Z

    return-void
.end method

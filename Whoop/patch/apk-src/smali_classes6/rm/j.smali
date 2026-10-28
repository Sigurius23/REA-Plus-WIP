.class public final Lrm/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Llo/t;

.field public final c:Lb9/d;

.field public final d:Lb9/d;

.field public e:Lyr/i;

.field public final f:Lb9/d;

.field public final g:Landroid/os/Looper;

.field public final h:Ltm/d;

.field public final i:I

.field public final j:Z

.field public final k:Lrm/h1;

.field public final l:J

.field public final m:J

.field public final n:Lb9/i;

.field public final o:J

.field public final p:J

.field public q:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 8

    new-instance v0, Lb9/d;

    const/4 v1, 0x5

    invoke-direct {v0, p1, v1}, Lb9/d;-><init>(Landroid/content/Context;I)V

    new-instance v1, Lb9/d;

    const/4 v2, 0x6

    invoke-direct {v1, p1, v2}, Lb9/d;-><init>(Landroid/content/Context;I)V

    new-instance v2, Lb9/d;

    const/4 v3, 0x7

    invoke-direct {v2, p1, v3}, Lb9/d;-><init>(Landroid/content/Context;I)V

    new-instance v3, Lb9/d;

    const/16 v4, 0x8

    invoke-direct {v3, p1, v4}, Lb9/d;-><init>(Landroid/content/Context;I)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrm/j;->a:Landroid/content/Context;

    iput-object v0, p0, Lrm/j;->c:Lb9/d;

    iput-object v1, p0, Lrm/j;->d:Lb9/d;

    iput-object v2, p0, Lrm/j;->e:Lyr/i;

    iput-object v3, p0, Lrm/j;->f:Lb9/d;

    sget p1, Llo/y;->a:I

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lrm/j;->g:Landroid/os/Looper;

    sget-object p1, Ltm/d;->G:Ltm/d;

    iput-object p1, p0, Lrm/j;->h:Ltm/d;

    const/4 p1, 0x1

    iput p1, p0, Lrm/j;->i:I

    iput-boolean p1, p0, Lrm/j;->j:Z

    sget-object p1, Lrm/h1;->c:Lrm/h1;

    iput-object p1, p0, Lrm/j;->k:Lrm/h1;

    const-wide/16 v0, 0x1388

    iput-wide v0, p0, Lrm/j;->l:J

    const-wide/16 v0, 0x3a98

    iput-wide v0, p0, Lrm/j;->m:J

    const-wide/16 v0, 0x14

    invoke-static {v0, v1}, Llo/y;->z(J)J

    move-result-wide v3

    const-wide/16 v0, 0x1f4

    invoke-static {v0, v1}, Llo/y;->z(J)J

    move-result-wide v5

    new-instance v2, Lb9/i;

    const/4 v7, 0x1

    invoke-direct/range {v2 .. v7}, Lb9/i;-><init>(JJI)V

    iput-object v2, p0, Lrm/j;->n:Lb9/i;

    sget-object p1, Llo/t;->a:Llo/t;

    iput-object p1, p0, Lrm/j;->b:Llo/t;

    iput-wide v0, p0, Lrm/j;->o:J

    const-wide/16 v0, 0x7d0

    iput-wide v0, p0, Lrm/j;->p:J

    return-void
.end method

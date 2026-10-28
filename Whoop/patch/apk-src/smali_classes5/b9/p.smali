.class public final Lb9/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lx8/p;

.field public final c:Lb9/d;

.field public d:Lyr/i;

.field public final e:Lb9/d;

.field public final f:Lb9/d;

.field public final g:Landroid/os/Looper;

.field public final h:I

.field public i:Lu8/d;

.field public j:Z

.field public final k:I

.field public final l:Z

.field public final m:Lb9/k1;

.field public final n:J

.field public final o:J

.field public final p:J

.field public final q:Lb9/i;

.field public final r:J

.field public final s:J

.field public final t:Z

.field public u:Z

.field public final v:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 10

    new-instance v0, Lb9/d;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lb9/d;-><init>(Landroid/content/Context;I)V

    new-instance v2, Lb9/d;

    const/4 v3, 0x2

    invoke-direct {v2, p1, v3}, Lb9/d;-><init>(Landroid/content/Context;I)V

    new-instance v3, Lb9/d;

    const/4 v4, 0x3

    invoke-direct {v3, p1, v4}, Lb9/d;-><init>(Landroid/content/Context;I)V

    new-instance v4, Lb9/d;

    const/4 v5, 0x4

    invoke-direct {v4, p1, v5}, Lb9/d;-><init>(Landroid/content/Context;I)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lb9/p;->a:Landroid/content/Context;

    iput-object v0, p0, Lb9/p;->c:Lb9/d;

    iput-object v2, p0, Lb9/p;->d:Lyr/i;

    iput-object v3, p0, Lb9/p;->e:Lb9/d;

    iput-object v4, p0, Lb9/p;->f:Lb9/d;

    sget p1, Lx8/t;->a:I

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lb9/p;->g:Landroid/os/Looper;

    sget-object p1, Lu8/d;->c:Lu8/d;

    iput-object p1, p0, Lb9/p;->i:Lu8/d;

    iput v1, p0, Lb9/p;->k:I

    iput-boolean v1, p0, Lb9/p;->l:Z

    sget-object p1, Lb9/k1;->c:Lb9/k1;

    iput-object p1, p0, Lb9/p;->m:Lb9/k1;

    const-wide/16 v2, 0x1388

    iput-wide v2, p0, Lb9/p;->n:J

    const-wide/16 v2, 0x3a98

    iput-wide v2, p0, Lb9/p;->o:J

    const-wide/16 v2, 0xbb8

    iput-wide v2, p0, Lb9/p;->p:J

    const-wide/16 v2, 0x14

    invoke-static {v2, v3}, Lx8/t;->J(J)J

    move-result-wide v5

    const-wide/16 v2, 0x1f4

    invoke-static {v2, v3}, Lx8/t;->J(J)J

    move-result-wide v7

    new-instance v4, Lb9/i;

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v9}, Lb9/i;-><init>(JJI)V

    iput-object v4, p0, Lb9/p;->q:Lb9/i;

    sget-object p1, Lx8/p;->a:Lx8/p;

    iput-object p1, p0, Lb9/p;->b:Lx8/p;

    iput-wide v2, p0, Lb9/p;->r:J

    const-wide/16 v2, 0x7d0

    iput-wide v2, p0, Lb9/p;->s:J

    iput-boolean v1, p0, Lb9/p;->t:Z

    const-string p1, ""

    iput-object p1, p0, Lb9/p;->v:Ljava/lang/String;

    const/16 p1, -0x3e8

    iput p1, p0, Lb9/p;->h:I

    new-instance p1, Lkr/e;

    invoke-direct {p1}, Lkr/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lb9/f0;
    .locals 2

    iget-boolean v0, p0, Lb9/p;->u:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lva3/g;->i(Z)V

    iput-boolean v1, p0, Lb9/p;->u:Z

    new-instance v0, Lb9/f0;

    invoke-direct {v0, p0}, Lb9/f0;-><init>(Lb9/p;)V

    return-object v0
.end method

.method public final b(Lu8/d;)V
    .locals 2

    iget-boolean v0, p0, Lb9/p;->u:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lva3/g;->i(Z)V

    iput-object p1, p0, Lb9/p;->i:Lu8/d;

    iput-boolean v1, p0, Lb9/p;->j:Z

    return-void
.end method

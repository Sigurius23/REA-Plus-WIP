.class public final Lgj/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Landroid/content/Context;

.field public final c:I

.field public final d:I

.field public final e:Ljava/lang/String;

.field public final f:Lik/c;

.field public final g:Lbu/c;

.field public final h:I

.field public final i:Lgj/n;

.field public final j:Z

.field public final k:J

.field public final l:J

.field public final m:Lik/c;

.field public final n:Ljc/a;

.field public final o:Z

.field public p:Ljava/lang/Boolean;

.field public q:Ljava/io/File;

.field public r:Ljava/util/Set;

.field public final s:I


# direct methods
.method public constructor <init>(Landroid/app/Application;Ljava/util/Set;)V
    .locals 5

    new-instance v0, Lbu/c;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lbu/c;-><init>(I)V

    new-instance v1, Lgj/n;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, v1, Lgj/n;->a:Ljava/util/HashSet;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v3, "context"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "serverZone"

    const/4 v4, 0x1

    invoke-static {v4, v3}, Lih0/d0;->w(ILjava/lang/String;)V

    const-string v3, "serverZone"

    invoke-static {v4, v3}, Lih0/d0;->w(ILjava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "4483d4bb0e3f071613d0cc2546aacc65"

    iput-object v3, p0, Lgj/g;->a:Ljava/lang/String;

    iput-object p1, p0, Lgj/g;->b:Landroid/content/Context;

    const/16 p1, 0x1e

    iput p1, p0, Lgj/g;->c:I

    const/16 p1, 0x7530

    iput p1, p0, Lgj/g;->d:I

    const-string p1, "$default_instance"

    iput-object p1, p0, Lgj/g;->e:Ljava/lang/String;

    sget-object p1, Ldk/d;->a:Lqt/e;

    iput-object p1, p0, Lgj/g;->f:Lik/c;

    iput-object v0, p0, Lgj/g;->g:Lbu/c;

    const/4 p1, 0x5

    iput p1, p0, Lgj/g;->h:I

    iput v4, p0, Lgj/g;->s:I

    iput-object v1, p0, Lgj/g;->i:Lgj/n;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lgj/g;->j:Z

    const-wide/32 v0, 0x493e0

    iput-wide v0, p0, Lgj/g;->k:J

    const-wide/16 v0, 0x7530

    iput-wide v0, p0, Lgj/g;->l:J

    sget-object v0, Ldk/d;->c:Lio/sentry/hints/j;

    iput-object v0, p0, Lgj/g;->m:Lik/c;

    sget-object v0, Ldk/d;->b:Ljc/a;

    iput-object v0, p0, Lgj/g;->n:Ljc/a;

    iput-boolean p1, p0, Lgj/g;->o:Z

    iput-object v2, p0, Lgj/g;->p:Ljava/lang/Boolean;

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2}, Lm83/s;->H1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p2

    iput-object p2, p0, Lgj/g;->r:Ljava/util/Set;

    new-instance p2, Lgj/h;

    new-instance v0, La3/m1;

    const/16 v1, 0xd

    invoke-direct {v0, p0, v1}, La3/m1;-><init>(Ljava/lang/Object;I)V

    const/4 v1, 0x0

    invoke-direct {p2, p1, v1, v1, v1}, Lgj/h;-><init>(ZZZZ)V

    iget-object p1, p2, Lgj/h;->e:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final a()Ljava/io/File;
    .locals 5

    iget-object v0, p0, Lgj/g;->q:Ljava/io/File;

    if-nez v0, :cond_0

    const-string v0, "amplitude"

    const/4 v1, 0x0

    iget-object v2, p0, Lgj/g;->b:Landroid/content/Context;

    invoke-virtual {v2, v0, v1}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x2f

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lgj/g;->e:Ljava/lang/String;

    const-string v4, "/analytics/"

    invoke-static {v2, v4, v3}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v1, p0, Lgj/g;->q:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_0
    iget-object v0, p0, Lgj/g;->q:Ljava/io/File;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0
.end method

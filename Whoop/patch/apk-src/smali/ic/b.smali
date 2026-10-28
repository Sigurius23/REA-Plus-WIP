.class public final Lic/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Lkc3/e;

.field public final c:Ljava/util/concurrent/Executor;

.field public final d:Lic/y;

.field public final e:Lic/i;

.field public final f:Lic/y;

.field public final g:Lad3/z;

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:I

.field public final l:Z

.field public final m:Lic/y;


# direct methods
.method public constructor <init>(Lic/y;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    invoke-static {p1}, Ljc/x;->f(Z)Ljava/util/concurrent/Executor;

    move-result-object p1

    iput-object p1, p0, Lic/b;->a:Ljava/util/concurrent/Executor;

    sget-object p1, Lbc3/q0;->a:Lkc3/e;

    iput-object p1, p0, Lic/b;->b:Lkc3/e;

    const/4 p1, 0x1

    invoke-static {p1}, Ljc/x;->f(Z)Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Lic/b;->c:Ljava/util/concurrent/Executor;

    new-instance v0, Lic/y;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lic/b;->d:Lic/y;

    sget-object v0, Lic/i;->a:Lic/i;

    iput-object v0, p0, Lic/b;->e:Lic/i;

    sget-object v0, Lic/y;->a:Lic/y;

    iput-object v0, p0, Lic/b;->f:Lic/y;

    new-instance v0, Lad3/z;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lad3/z;-><init>(I)V

    iput-object v0, p0, Lic/b;->g:Lad3/z;

    const/4 v0, 0x4

    iput v0, p0, Lic/b;->h:I

    const v0, 0x7fffffff

    iput v0, p0, Lic/b;->i:I

    const/16 v0, 0x14

    iput v0, p0, Lic/b;->k:I

    const/16 v0, 0x8

    iput v0, p0, Lic/b;->j:I

    iput-boolean p1, p0, Lic/b;->l:Z

    new-instance p1, Lic/y;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lic/b;->m:Lic/y;

    return-void
.end method

.class public final Lr9/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final o:Lm5/e;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Llo/w;

.field public final c:Lr9/h;

.field public final d:Landroid/util/SparseArray;

.field public final e:Lzr/w0;

.field public final f:Lr9/c;

.field public final g:Lx8/p;

.field public final h:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public i:Lx8/r;

.field public j:Landroid/util/Pair;

.field public k:I

.field public l:J

.field public m:J

.field public n:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm5/e;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lm5/e;-><init>(I)V

    sput-object v0, Lr9/i;->o:Lm5/e;

    return-void
.end method

.method public constructor <init>(Ld30/f0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Ld30/f0;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iput-object v0, p0, Lr9/i;->a:Landroid/content/Context;

    new-instance v0, Llo/w;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Llo/w;-><init>(I)V

    iput-object v0, p0, Lr9/i;->b:Llo/w;

    iget-object v0, p1, Ld30/f0;->f:Ljava/lang/Object;

    check-cast v0, Lr9/h;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    iput-object v0, p0, Lr9/i;->c:Lr9/h;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lr9/i;->d:Landroid/util/SparseArray;

    iget-object v0, p1, Ld30/f0;->g:Ljava/lang/Object;

    check-cast v0, Lzr/w0;

    iput-object v0, p0, Lr9/i;->e:Lzr/w0;

    iget-object v0, p1, Ld30/f0;->b:Ljava/lang/Object;

    check-cast v0, Lx8/p;

    iput-object v0, p0, Lr9/i;->g:Lx8/p;

    new-instance v1, Lr9/c;

    iget-object p1, p1, Ld30/f0;->d:Ljava/lang/Object;

    check-cast p1, Lr9/n;

    invoke-direct {v1, p1, v0}, Lr9/c;-><init>(Lr9/n;Lx8/p;)V

    iput-object v1, p0, Lr9/i;->f:Lr9/c;

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object p1, p0, Lr9/i;->h:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance p1, Lu8/o;

    invoke-direct {p1}, Lu8/o;-><init>()V

    invoke-virtual {p1}, Lu8/o;->a()Lu8/p;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lr9/i;->l:J

    const/4 p1, -0x1

    iput p1, p0, Lr9/i;->n:I

    const/4 p1, 0x0

    iput p1, p0, Lr9/i;->k:I

    return-void
.end method

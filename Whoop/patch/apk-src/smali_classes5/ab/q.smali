.class public final Lab/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lt9/k0;

.field public final b:Z

.field public final c:Z

.field public final d:Landroid/util/SparseArray;

.field public final e:Landroid/util/SparseArray;

.field public final f:Llo/s;

.field public g:[B

.field public h:I

.field public i:I

.field public j:J

.field public k:Z

.field public l:J

.field public m:Lab/p;

.field public n:Lab/p;

.field public o:Z

.field public p:J

.field public q:J

.field public r:Z

.field public s:Z


# direct methods
.method public constructor <init>(Lt9/k0;ZZ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lab/q;->a:Lt9/k0;

    iput-boolean p2, p0, Lab/q;->b:Z

    iput-boolean p3, p0, Lab/q;->c:Z

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lab/q;->d:Landroid/util/SparseArray;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lab/q;->e:Landroid/util/SparseArray;

    new-instance p1, Lab/p;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lab/q;->m:Lab/p;

    new-instance p1, Lab/p;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lab/q;->n:Lab/p;

    const/16 p1, 0x80

    new-array p1, p1, [B

    iput-object p1, p0, Lab/q;->g:[B

    new-instance p2, Llo/s;

    const/4 p3, 0x6

    const/4 v0, 0x0

    invoke-direct {p2, v0, v0, p3, p1}, Llo/s;-><init>(III[B)V

    iput-object p2, p0, Lab/q;->f:Llo/s;

    iput-boolean v0, p0, Lab/q;->k:Z

    iput-boolean v0, p0, Lab/q;->o:Z

    iget-object p1, p0, Lab/q;->n:Lab/p;

    iput-boolean v0, p1, Lab/p;->b:Z

    iput-boolean v0, p1, Lab/p;->a:Z

    return-void
.end method

.class public final Lfn/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lwm/s;

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


# direct methods
.method public constructor <init>(Lwm/s;ZZ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfn/m;->a:Lwm/s;

    iput-boolean p2, p0, Lfn/m;->b:Z

    iput-boolean p3, p0, Lfn/m;->c:Z

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lfn/m;->d:Landroid/util/SparseArray;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lfn/m;->e:Landroid/util/SparseArray;

    new-instance p1, Lab/p;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfn/m;->m:Lab/p;

    new-instance p1, Lab/p;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfn/m;->n:Lab/p;

    const/16 p1, 0x80

    new-array p1, p1, [B

    iput-object p1, p0, Lfn/m;->g:[B

    new-instance p2, Llo/s;

    const/4 p3, 0x1

    const/4 v0, 0x0

    invoke-direct {p2, v0, v0, p3, p1}, Llo/s;-><init>(III[B)V

    iput-object p2, p0, Lfn/m;->f:Llo/s;

    iput-boolean v0, p0, Lfn/m;->k:Z

    iput-boolean v0, p0, Lfn/m;->o:Z

    iget-object p1, p0, Lfn/m;->n:Lab/p;

    iput-boolean v0, p1, Lab/p;->b:Z

    iput-boolean v0, p1, Lab/p;->a:Z

    return-void
.end method

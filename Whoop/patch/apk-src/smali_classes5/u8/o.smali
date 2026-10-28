.class public final Lu8/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:Lu8/g;

.field public B:I

.field public C:I

.field public D:I

.field public E:I

.field public F:I

.field public G:I

.field public H:I

.field public I:I

.field public J:I

.field public K:I

.field public L:I

.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Lzr/g0;

.field public d:Ljava/lang/String;

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:Ljava/lang/String;

.field public k:Lu8/c0;

.field public l:Ljava/lang/String;

.field public m:Ljava/lang/String;

.field public n:I

.field public o:I

.field public p:Ljava/util/List;

.field public q:Lu8/l;

.field public r:J

.field public s:Z

.field public t:I

.field public u:I

.field public v:F

.field public w:I

.field public x:F

.field public y:[B

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lzr/g0;->x:Lzr/e0;

    sget-object v0, Lzr/w0;->E:Lzr/w0;

    iput-object v0, p0, Lu8/o;->c:Lzr/g0;

    const/4 v0, -0x1

    iput v0, p0, Lu8/o;->h:I

    iput v0, p0, Lu8/o;->i:I

    iput v0, p0, Lu8/o;->n:I

    iput v0, p0, Lu8/o;->o:I

    const-wide v1, 0x7fffffffffffffffL

    iput-wide v1, p0, Lu8/o;->r:J

    iput v0, p0, Lu8/o;->t:I

    iput v0, p0, Lu8/o;->u:I

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Lu8/o;->v:F

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Lu8/o;->x:F

    iput v0, p0, Lu8/o;->z:I

    iput v0, p0, Lu8/o;->B:I

    iput v0, p0, Lu8/o;->C:I

    iput v0, p0, Lu8/o;->D:I

    iput v0, p0, Lu8/o;->E:I

    iput v0, p0, Lu8/o;->H:I

    const/4 v1, 0x1

    iput v1, p0, Lu8/o;->I:I

    iput v0, p0, Lu8/o;->J:I

    iput v0, p0, Lu8/o;->K:I

    const/4 v0, 0x0

    iput v0, p0, Lu8/o;->L:I

    iput v0, p0, Lu8/o;->g:I

    return-void
.end method


# virtual methods
.method public final a()Lu8/p;
    .locals 1

    new-instance v0, Lu8/p;

    invoke-direct {v0, p0}, Lu8/p;-><init>(Lu8/o;)V

    return-object v0
.end method

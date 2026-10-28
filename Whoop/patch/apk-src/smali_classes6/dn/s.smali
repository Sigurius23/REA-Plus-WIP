.class public final Ldn/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J

.field public b:J

.field public c:I

.field public d:I

.field public e:[J

.field public f:[I

.field public g:[I

.field public h:[J

.field public i:[Z

.field public j:Z

.field public k:[Z

.field public l:Z

.field public m:J

.field public n:Z

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public final q:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    packed-switch p1, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    new-array v0, p1, [J

    iput-object v0, p0, Ldn/s;->e:[J

    new-array v0, p1, [I

    iput-object v0, p0, Ldn/s;->f:[I

    new-array v0, p1, [I

    iput-object v0, p0, Ldn/s;->g:[I

    new-array v0, p1, [J

    iput-object v0, p0, Ldn/s;->h:[J

    new-array v0, p1, [Z

    iput-object v0, p0, Ldn/s;->i:[Z

    new-array p1, p1, [Z

    iput-object p1, p0, Ldn/s;->k:[Z

    new-instance p1, Led3/a;

    invoke-direct {p1}, Led3/a;-><init>()V

    iput-object p1, p0, Ldn/s;->q:Ljava/lang/Object;

    return-void

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    new-array v0, p1, [J

    iput-object v0, p0, Ldn/s;->e:[J

    new-array v0, p1, [I

    iput-object v0, p0, Ldn/s;->f:[I

    new-array v0, p1, [I

    iput-object v0, p0, Ldn/s;->g:[I

    new-array v0, p1, [J

    iput-object v0, p0, Ldn/s;->h:[J

    new-array v0, p1, [Z

    iput-object v0, p0, Ldn/s;->i:[Z

    new-array p1, p1, [Z

    iput-object p1, p0, Ldn/s;->k:[Z

    new-instance p1, Lx8/n;

    invoke-direct {p1}, Lx8/n;-><init>()V

    iput-object p1, p0, Ldn/s;->q:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

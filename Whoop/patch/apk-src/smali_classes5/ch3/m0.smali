.class public final Lch3/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxg3/f;


# instance fields
.field public final w:Ljava/lang/Long;

.field public final x:Lbh3/a;

.field public final y:Lxg3/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lch3/m0;->w:Ljava/lang/Long;

    .line 3
    iput-object v0, p0, Lch3/m0;->x:Lbh3/a;

    .line 4
    sget-object v0, Lxg3/a;->c:Lxg3/a;

    iput-object v0, p0, Lch3/m0;->y:Lxg3/b;

    return-void
.end method

.method public constructor <init>(JLbh3/a;Lxg3/b;)V
    .locals 2

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_1

    if-eqz p4, :cond_0

    .line 6
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lch3/m0;->w:Ljava/lang/Long;

    .line 7
    iput-object p3, p0, Lch3/m0;->x:Lbh3/a;

    .line 8
    iput-object p4, p0, Lch3/m0;->y:Lxg3/b;

    return-void

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "The BackpressureOverflow strategy must not be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 10
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Buffer capacity must be > 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    check-cast p1, Lxg3/s;

    new-instance v0, Lch3/k0;

    iget-object v1, p0, Lch3/m0;->x:Lbh3/a;

    iget-object v2, p0, Lch3/m0;->y:Lxg3/b;

    iget-object v3, p0, Lch3/m0;->w:Ljava/lang/Long;

    invoke-direct {v0, p1, v3, v1, v2}, Lch3/k0;-><init>(Lxg3/s;Ljava/lang/Long;Lbh3/a;Lxg3/b;)V

    invoke-virtual {p1, v0}, Lxg3/s;->c(Lxg3/t;)V

    iget-object v1, v0, Lch3/k0;->I:Lgh3/b;

    invoke-virtual {p1, v1}, Lxg3/s;->f(Lxg3/i;)V

    return-object v0
.end method

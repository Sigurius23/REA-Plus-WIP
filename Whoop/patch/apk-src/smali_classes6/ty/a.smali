.class public final Lty/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lpg3/p;

.field public final b:Lq30/u0;

.field public final c:Lab/i0;

.field public final d:Lb20/f;

.field public final e:Lq83/j;

.field public f:Lty/b;


# direct methods
.method public constructor <init>(Lpg3/p;Lq30/u0;Lab/i0;Lb20/f;Lq83/j;Lux/f0;)V
    .locals 0

    const-string p6, "workContext"

    invoke-static {p5, p6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lty/a;->a:Lpg3/p;

    iput-object p2, p0, Lty/a;->b:Lq30/u0;

    iput-object p3, p0, Lty/a;->c:Lab/i0;

    iput-object p4, p0, Lty/a;->d:Lb20/f;

    iput-object p5, p0, Lty/a;->e:Lq83/j;

    return-void
.end method


# virtual methods
.method public final a()Lty/b;
    .locals 2

    iget-object v0, p0, Lty/a;->f:Lty/b;

    sget-boolean v1, Lux/j0;->d:Z

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final b()V
    .locals 4

    sget-boolean v0, Lux/j0;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lty/a;->e:Lq83/j;

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    new-instance v1, Lsz/q;

    const/4 v2, 0x6

    const/4 v3, 0x0

    invoke-direct {v1, p0, v3, v2}, Lsz/q;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v2, 0x3

    invoke-static {v0, v3, v3, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    return-void
.end method

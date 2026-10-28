.class public abstract Lf9/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final E:Lf9/j;

.field public final w:Lu8/p;

.field public final x:Lzr/g0;

.field public final y:J

.field public final z:Ljava/util/List;


# direct methods
.method public constructor <init>(Lu8/p;Ljava/util/List;Lf9/s;Ljava/util/List;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lva3/g;->d(Z)V

    iput-object p1, p0, Lf9/m;->w:Lu8/p;

    invoke-static {p2}, Lzr/g0;->m(Ljava/util/Collection;)Lzr/g0;

    move-result-object p1

    iput-object p1, p0, Lf9/m;->x:Lzr/g0;

    if-nez p4, :cond_0

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_0

    :cond_0
    invoke-static {p4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lf9/m;->z:Ljava/util/List;

    invoke-virtual {p3, p0}, Lf9/s;->a(Lf9/m;)Lf9/j;

    move-result-object p1

    iput-object p1, p0, Lf9/m;->E:Lf9/j;

    iget-wide v0, p3, Lf9/s;->c:J

    iget-wide v4, p3, Lf9/s;->b:J

    sget p1, Lx8/t;->a:I

    sget-object v6, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v2, 0xf4240

    invoke-static/range {v0 .. v6}, Lx8/t;->Q(JJJLjava/math/RoundingMode;)J

    move-result-wide p1

    iput-wide p1, p0, Lf9/m;->y:J

    return-void
.end method


# virtual methods
.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()Le9/i;
.end method

.method public abstract d()Lf9/j;
.end method

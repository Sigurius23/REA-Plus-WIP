.class public final Lec3/r1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/f2;
.implements Lec3/d;
.implements Lfc3/q;


# instance fields
.field public final synthetic w:Lec3/f2;

.field public final x:Lbc3/k1;


# direct methods
.method public constructor <init>(Lec3/p1;Lbc3/k1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lec3/r1;->w:Lec3/f2;

    iput-object p2, p0, Lec3/r1;->x:Lbc3/k1;

    return-void
.end method


# virtual methods
.method public final b(Lq83/j;ILdc3/a;)Lec3/l;
    .locals 1

    if-ltz p2, :cond_0

    const/4 v0, 0x2

    if-ge p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, -0x2

    if-ne p2, v0, :cond_1

    :goto_0
    sget-object v0, Ldc3/a;->x:Ldc3/a;

    if-ne p3, v0, :cond_1

    move-object p1, p0

    goto :goto_1

    :cond_1
    invoke-static {p0, p1, p2, p3}, Lec3/v;->G(Lec3/t1;Lq83/j;ILdc3/a;)Lec3/l;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public final collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v0, p1, p2}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getReplayCache()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v0}, Lec3/t1;->getReplayCache()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

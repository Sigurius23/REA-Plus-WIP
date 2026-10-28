.class public final Lec3/q1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/t1;
.implements Lec3/d;
.implements Lfc3/q;


# instance fields
.field public final synthetic w:Lec3/t1;

.field public final x:Lbc3/k1;


# direct methods
.method public constructor <init>(Lec3/o1;Lbc3/k1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lec3/q1;->w:Lec3/t1;

    iput-object p2, p0, Lec3/q1;->x:Lbc3/k1;

    return-void
.end method


# virtual methods
.method public final b(Lq83/j;ILdc3/a;)Lec3/l;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lec3/v;->G(Lec3/t1;Lq83/j;ILdc3/a;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method public final collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lec3/q1;->w:Lec3/t1;

    invoke-interface {v0, p1, p2}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getReplayCache()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lec3/q1;->w:Lec3/t1;

    invoke-interface {v0}, Lec3/t1;->getReplayCache()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

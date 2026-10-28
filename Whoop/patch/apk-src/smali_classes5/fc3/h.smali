.class public final Lfc3/h;
.super Lfc3/g;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lec3/l;Lq83/j;ILdc3/a;I)V
    .locals 1

    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_0

    sget-object p2, Lq83/k;->w:Lq83/k;

    :cond_0
    and-int/lit8 v0, p5, 0x4

    if-eqz v0, :cond_1

    const/4 p3, -0x3

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    sget-object p4, Ldc3/a;->w:Ldc3/a;

    :cond_2
    invoke-direct {p0, p3, p4, p1, p2}, Lfc3/g;-><init>(ILdc3/a;Lec3/l;Lq83/j;)V

    return-void
.end method


# virtual methods
.method public final f(Lq83/j;ILdc3/a;)Lfc3/d;
    .locals 2

    new-instance v0, Lfc3/h;

    iget-object v1, p0, Lfc3/g;->z:Lec3/l;

    invoke-direct {v0, p2, p3, v1, p1}, Lfc3/g;-><init>(ILdc3/a;Lec3/l;Lq83/j;)V

    return-object v0
.end method

.method public final g()Lec3/l;
    .locals 1

    iget-object v0, p0, Lfc3/g;->z:Lec3/l;

    return-object v0
.end method

.method public final i(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lfc3/g;->z:Lec3/l;

    invoke-interface {v0, p1, p2}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

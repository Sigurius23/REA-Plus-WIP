.class public final Llg3/r;
.super Lce/w;
.source "SourceFile"


# instance fields
.field public final synthetic F:Lkg3/a;

.field public final synthetic G:Lng3/k;

.field public final synthetic H:Lkg3/d;

.field public final synthetic I:Ljg3/o;


# direct methods
.method public constructor <init>(Ljg3/d;Lng3/k;Lkg3/d;Ljg3/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llg3/r;->F:Lkg3/a;

    iput-object p2, p0, Llg3/r;->G:Lng3/k;

    iput-object p3, p0, Llg3/r;->H:Lkg3/d;

    iput-object p4, p0, Llg3/r;->I:Ljg3/o;

    return-void
.end method


# virtual methods
.method public final a(Lng3/m;)Z
    .locals 2

    iget-object v0, p0, Llg3/r;->F:Lkg3/a;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lng3/m;->isDateBased()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Lkg3/a;->a(Lng3/m;)Z

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Llg3/r;->G:Lng3/k;

    invoke-interface {v0, p1}, Lng3/k;->a(Lng3/m;)Z

    move-result p1

    return p1
.end method

.method public final d(Lng3/m;)Lng3/s;
    .locals 2

    iget-object v0, p0, Llg3/r;->F:Lkg3/a;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lng3/m;->isDateBased()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Lce/w;->d(Lng3/m;)Lng3/s;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Llg3/r;->G:Lng3/k;

    invoke-interface {v0, p1}, Lng3/k;->d(Lng3/m;)Lng3/s;

    move-result-object p1

    return-object p1
.end method

.method public final g(Lng3/q;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lng3/p;->b:Lg73/d;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Llg3/r;->H:Lkg3/d;

    return-object p1

    :cond_0
    sget-object v0, Lng3/p;->a:Lg73/a;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Llg3/r;->I:Ljg3/o;

    return-object p1

    :cond_1
    sget-object v0, Lng3/p;->c:Lng3/n;

    if-ne p1, v0, :cond_2

    iget-object v0, p0, Llg3/r;->G:Lng3/k;

    invoke-interface {v0, p1}, Lng3/k;->g(Lng3/q;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-interface {p1, p0}, Lng3/q;->l(Lng3/k;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final h(Lng3/m;)J
    .locals 2

    iget-object v0, p0, Llg3/r;->F:Lkg3/a;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lng3/m;->isDateBased()Z

    move-result v1

    if-eqz v1, :cond_0

    check-cast v0, Ljg3/d;

    invoke-virtual {v0, p1}, Ljg3/d;->h(Lng3/m;)J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-object v0, p0, Llg3/r;->G:Lng3/k;

    invoke-interface {v0, p1}, Lng3/k;->h(Lng3/m;)J

    move-result-wide v0

    return-wide v0
.end method

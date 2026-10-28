.class public abstract Lk4/c;
.super Lj4/g;
.source "SourceFile"


# instance fields
.field public n0:F

.field public final o0:Ljava/util/HashMap;

.field public final p0:Ljava/util/HashMap;

.field public final q0:Ljava/util/HashMap;

.field public r0:Ljava/util/HashMap;

.field public s0:Ljava/util/HashMap;

.field public t0:Lj4/i;


# direct methods
.method public constructor <init>(Le4/s;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj4/g;-><init>(Le4/s;I)V

    const/high16 p1, 0x3f000000    # 0.5f

    iput p1, p0, Lk4/c;->n0:F

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lk4/c;->o0:Ljava/util/HashMap;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lk4/c;->p0:Ljava/util/HashMap;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lk4/c;->q0:Ljava/util/HashMap;

    sget-object p1, Lj4/i;->w:Lj4/i;

    iput-object p1, p0, Lk4/c;->t0:Lj4/i;

    return-void
.end method


# virtual methods
.method public final t(Ljava/lang/String;FFFFF)V
    .locals 1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lj4/g;->q([Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lk4/c;->o0:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-static {p3}, Ljava/lang/Float;->isNaN(F)Z

    move-result p2

    if-nez p2, :cond_1

    iget-object p2, p0, Lk4/c;->p0:Ljava/util/HashMap;

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-virtual {p2, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-static {p4}, Ljava/lang/Float;->isNaN(F)Z

    move-result p2

    if-nez p2, :cond_2

    iget-object p2, p0, Lk4/c;->q0:Ljava/util/HashMap;

    invoke-static {p4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-virtual {p2, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-static {p5}, Ljava/lang/Float;->isNaN(F)Z

    move-result p2

    if-nez p2, :cond_4

    iget-object p2, p0, Lk4/c;->r0:Ljava/util/HashMap;

    if-nez p2, :cond_3

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lk4/c;->r0:Ljava/util/HashMap;

    :cond_3
    iget-object p2, p0, Lk4/c;->r0:Ljava/util/HashMap;

    invoke-static {p5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-virtual {p2, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    invoke-static {p6}, Ljava/lang/Float;->isNaN(F)Z

    move-result p2

    if-nez p2, :cond_6

    iget-object p2, p0, Lk4/c;->s0:Ljava/util/HashMap;

    if-nez p2, :cond_5

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lk4/c;->s0:Ljava/util/HashMap;

    :cond_5
    iget-object p2, p0, Lk4/c;->s0:Ljava/util/HashMap;

    invoke-static {p6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-virtual {p2, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    return-void
.end method

.method public final u(F)V
    .locals 0

    iput p1, p0, Lk4/c;->n0:F

    return-void
.end method

.method public final v(Ljava/lang/String;)F
    .locals 1

    iget-object v0, p0, Lk4/c;->s0:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lk4/c;->s0:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final w(Ljava/lang/String;)F
    .locals 2

    iget-object v0, p0, Lk4/c;->q0:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final x(Ljava/lang/String;)F
    .locals 1

    iget-object v0, p0, Lk4/c;->r0:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lk4/c;->r0:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final y(Ljava/lang/String;)F
    .locals 2

    iget-object v0, p0, Lk4/c;->p0:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final z(Lj4/i;)V
    .locals 0

    iput-object p1, p0, Lk4/c;->t0:Lj4/i;

    return-void
.end method

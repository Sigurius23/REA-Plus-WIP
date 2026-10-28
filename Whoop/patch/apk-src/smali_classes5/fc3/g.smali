.class public abstract Lfc3/g;
.super Lfc3/d;
.source "SourceFile"


# instance fields
.field public final z:Lec3/l;


# direct methods
.method public constructor <init>(ILdc3/a;Lec3/l;Lq83/j;)V
    .locals 0

    invoke-direct {p0, p4, p1, p2}, Lfc3/d;-><init>(Lq83/j;ILdc3/a;)V

    iput-object p3, p0, Lfc3/g;->z:Lec3/l;

    return-void
.end method


# virtual methods
.method public final collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lfc3/d;->x:I

    const/4 v1, -0x3

    if-ne v0, v1, :cond_4

    invoke-interface {p2}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v2, Lb52/a;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lb52/a;-><init>(I)V

    iget-object v3, p0, Lfc3/d;->w:Lq83/j;

    invoke-interface {v3, v1, v2}, Lq83/j;->fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0, v3}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-static {v0, v3, v1}, Lbc3/f0;->p(Lq83/j;Lq83/j;Z)Lq83/j;

    move-result-object v1

    :goto_0
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0, p1, p2}, Lfc3/g;->i(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_5

    return-object p1

    :cond_1
    sget-object v2, Lq83/e;->w:Lq83/e;

    invoke-interface {v1, v2}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v3

    invoke-interface {v0, v2}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p2}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    instance-of v2, p1, Lfc3/w;

    if-nez v2, :cond_3

    instance-of v2, p1, Lfc3/s;

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    new-instance v2, Lec3/f1;

    invoke-direct {v2, p1, v0}, Lec3/f1;-><init>(Lec3/m;Lq83/j;)V

    move-object p1, v2

    :cond_3
    :goto_1
    new-instance v0, Ld30/o;

    const/4 v2, 0x0

    const/16 v3, 0xe

    invoke-direct {v0, p0, v2, v3}, Ld30/o;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v1}, Lhc3/b;->l(Lq83/j;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, p1, v2, v0, p2}, Lfc3/b;->c(Lq83/j;Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_5

    return-object p1

    :cond_4
    invoke-super {p0, p1, p2}, Lfc3/d;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_5

    return-object p1

    :cond_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final e(Ldc3/u;Lq83/d;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lfc3/w;

    invoke-direct {v0, p1}, Lfc3/w;-><init>(Ldc3/u;)V

    invoke-virtual {p0, v0, p2}, Lfc3/g;->i(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public abstract i(Lec3/m;Lq83/d;)Ljava/lang/Object;
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lfc3/g;->z:Lec3/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lfc3/d;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

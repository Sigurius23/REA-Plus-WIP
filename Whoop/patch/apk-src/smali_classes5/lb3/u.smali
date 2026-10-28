.class public final Llb3/u;
.super Llb3/y0;
.source "SourceFile"


# instance fields
.field public final b:[Lr93/x0;

.field public final c:[Llb3/u0;

.field public final d:Z


# direct methods
.method public constructor <init>([Lr93/x0;[Llb3/u0;Z)V
    .locals 1

    const-string v0, "parameters"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb3/u;->b:[Lr93/x0;

    iput-object p2, p0, Llb3/u;->c:[Llb3/u0;

    iput-boolean p3, p0, Llb3/u;->d:Z

    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Llb3/u;->d:Z

    return v0
.end method

.method public final d(Llb3/y;)Llb3/u0;
    .locals 4

    invoke-virtual {p1}, Llb3/y;->i0()Llb3/q0;

    move-result-object p1

    invoke-interface {p1}, Llb3/q0;->d()Lr93/h;

    move-result-object p1

    instance-of v0, p1, Lr93/x0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lr93/x0;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p1}, Lr93/x0;->getIndex()I

    move-result v0

    iget-object v2, p0, Llb3/u;->b:[Lr93/x0;

    array-length v3, v2

    if-ge v0, v3, :cond_2

    aget-object v2, v2, v0

    invoke-interface {v2}, Lr93/x0;->e()Llb3/q0;

    move-result-object v2

    invoke-interface {p1}, Lr93/x0;->e()Llb3/q0;

    move-result-object p1

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Llb3/u;->c:[Llb3/u0;

    aget-object p1, p1, v0

    return-object p1

    :cond_2
    :goto_1
    return-object v1
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Llb3/u;->c:[Llb3/u0;

    array-length v0, v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

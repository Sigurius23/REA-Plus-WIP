.class public final Lxe3/o;
.super Lcf3/a;
.source "SourceFile"


# instance fields
.field public final a:Laf3/s;

.field public final b:I

.field public c:Z


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Laf3/s;

    invoke-direct {v0}, Laf3/t;-><init>()V

    iput-object v0, p0, Lxe3/o;->a:Laf3/s;

    iput p1, p0, Lxe3/o;->b:I

    return-void
.end method


# virtual methods
.method public final c(Laf3/a;)Z
    .locals 1

    iget-boolean p1, p0, Lxe3/o;->c:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lxe3/o;->a:Laf3/s;

    iget-object p1, p1, Laf3/t;->a:Laf3/t;

    check-cast p1, Laf3/a;

    instance-of v0, p1, Laf3/r;

    if-eqz v0, :cond_0

    check-cast p1, Laf3/r;

    const/4 v0, 0x0

    iput-boolean v0, p1, Laf3/r;->g:Z

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public final f()Laf3/a;
    .locals 1

    iget-object v0, p0, Lxe3/o;->a:Laf3/s;

    return-object v0
.end method

.method public final g()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final i(Lxe3/g;)Lha/h;
    .locals 3

    iget-boolean v0, p1, Lxe3/g;->i:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lxe3/o;->a:Laf3/s;

    iget-object v0, v0, Laf3/t;->b:Laf3/t;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lxe3/g;->h()Lcf3/a;

    move-result-object v0

    invoke-virtual {v0}, Lcf3/a;->f()Laf3/a;

    move-result-object v0

    instance-of v2, v0, Laf3/w;

    if-nez v2, :cond_1

    instance-of v0, v0, Laf3/s;

    if-eqz v0, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    iput-boolean v1, p0, Lxe3/o;->c:Z

    iget p1, p1, Lxe3/g;->f:I

    invoke-static {p1}, Lha/h;->a(I)Lha/h;

    move-result-object p1

    return-object p1

    :cond_3
    iget v0, p1, Lxe3/g;->h:I

    iget v2, p0, Lxe3/o;->b:I

    if-lt v0, v2, :cond_4

    iget p1, p1, Lxe3/g;->d:I

    add-int/2addr p1, v2

    new-instance v0, Lha/h;

    const/4 v2, -0x1

    invoke-direct {v0, v2, p1, v1}, Lha/h;-><init>(IIZ)V

    return-object v0

    :cond_4
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.class public final Lxe3/n;
.super Lcf3/a;
.source "SourceFile"


# instance fields
.field public final a:Laf3/r;

.field public b:Z

.field public c:I


# direct methods
.method public constructor <init>(Laf3/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxe3/n;->a:Laf3/r;

    return-void
.end method


# virtual methods
.method public final c(Laf3/a;)Z
    .locals 2

    instance-of p1, p1, Laf3/s;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lxe3/n;->b:Z

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    iget p1, p0, Lxe3/n;->c:I

    if-ne p1, v1, :cond_0

    iget-object p1, p0, Lxe3/n;->a:Laf3/r;

    iput-boolean v0, p1, Laf3/r;->g:Z

    iput-boolean v0, p0, Lxe3/n;->b:Z

    :cond_0
    return v1

    :cond_1
    return v0
.end method

.method public final f()Laf3/a;
    .locals 1

    iget-object v0, p0, Lxe3/n;->a:Laf3/r;

    return-object v0
.end method

.method public final g()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final i(Lxe3/g;)Lha/h;
    .locals 2

    iget-boolean v0, p1, Lxe3/g;->i:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lxe3/n;->b:Z

    const/4 v0, 0x0

    iput v0, p0, Lxe3/n;->c:I

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lxe3/n;->b:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lxe3/n;->c:I

    add-int/2addr v0, v1

    iput v0, p0, Lxe3/n;->c:I

    :cond_1
    :goto_0
    iget p1, p1, Lxe3/g;->c:I

    invoke-static {p1}, Lha/h;->a(I)Lha/h;

    move-result-object p1

    return-object p1
.end method

.class public final Landroidx/glance/appwidget/protobuf/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/glance/appwidget/protobuf/b1;


# instance fields
.field public final a:Landroidx/glance/appwidget/protobuf/a;

.field public final b:Landroidx/glance/appwidget/protobuf/d1;

.field public final c:Landroidx/glance/appwidget/protobuf/t;


# direct methods
.method public constructor <init>(Landroidx/glance/appwidget/protobuf/d1;Landroidx/glance/appwidget/protobuf/t;Landroidx/glance/appwidget/protobuf/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/glance/appwidget/protobuf/t0;->b:Landroidx/glance/appwidget/protobuf/d1;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p2, p0, Landroidx/glance/appwidget/protobuf/t0;->c:Landroidx/glance/appwidget/protobuf/t;

    iput-object p3, p0, Landroidx/glance/appwidget/protobuf/t0;->a:Landroidx/glance/appwidget/protobuf/a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Landroidx/glance/appwidget/protobuf/t0;->b:Landroidx/glance/appwidget/protobuf/d1;

    invoke-static {v0, p1, p2}, Landroidx/glance/appwidget/protobuf/c1;->k(Landroidx/glance/appwidget/protobuf/d1;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Landroidx/glance/appwidget/protobuf/t0;->b:Landroidx/glance/appwidget/protobuf/d1;

    check-cast v0, Landroidx/glance/appwidget/protobuf/f1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v0, p1

    check-cast v0, Landroidx/glance/appwidget/protobuf/a0;

    iget-object v0, v0, Landroidx/glance/appwidget/protobuf/a0;->unknownFields:Landroidx/glance/appwidget/protobuf/e1;

    iget-boolean v1, v0, Landroidx/glance/appwidget/protobuf/e1;->e:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, Landroidx/glance/appwidget/protobuf/e1;->e:Z

    :cond_0
    iget-object v0, p0, Landroidx/glance/appwidget/protobuf/t0;->c:Landroidx/glance/appwidget/protobuf/t;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lr;->t(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final c(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Landroidx/glance/appwidget/protobuf/t0;->c:Landroidx/glance/appwidget/protobuf/t;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lr;->t(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final d()Landroidx/glance/appwidget/protobuf/a0;
    .locals 2

    iget-object v0, p0, Landroidx/glance/appwidget/protobuf/t0;->a:Landroidx/glance/appwidget/protobuf/a;

    instance-of v1, v0, Landroidx/glance/appwidget/protobuf/a0;

    if-eqz v1, :cond_0

    check-cast v0, Landroidx/glance/appwidget/protobuf/a0;

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/a0;->j()Landroidx/glance/appwidget/protobuf/a0;

    move-result-object v0

    return-object v0

    :cond_0
    check-cast v0, Landroidx/glance/appwidget/protobuf/a0;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroidx/glance/appwidget/protobuf/a0;->d(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/glance/appwidget/protobuf/y;

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/y;->b()Landroidx/glance/appwidget/protobuf/a0;

    move-result-object v0

    return-object v0
.end method

.method public final e(Ljava/lang/Object;Landroidx/glance/appwidget/protobuf/m;Landroidx/glance/appwidget/protobuf/s;)V
    .locals 0

    iget-object p2, p0, Landroidx/glance/appwidget/protobuf/t0;->b:Landroidx/glance/appwidget/protobuf/d1;

    invoke-virtual {p2, p1}, Landroidx/glance/appwidget/protobuf/d1;->a(Ljava/lang/Object;)Landroidx/glance/appwidget/protobuf/e1;

    iget-object p2, p0, Landroidx/glance/appwidget/protobuf/t0;->c:Landroidx/glance/appwidget/protobuf/t;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1
.end method

.method public final f(Landroidx/glance/appwidget/protobuf/a0;)I
    .locals 1

    iget-object v0, p0, Landroidx/glance/appwidget/protobuf/t0;->b:Landroidx/glance/appwidget/protobuf/d1;

    check-cast v0, Landroidx/glance/appwidget/protobuf/f1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Landroidx/glance/appwidget/protobuf/a0;->unknownFields:Landroidx/glance/appwidget/protobuf/e1;

    invoke-virtual {p1}, Landroidx/glance/appwidget/protobuf/e1;->hashCode()I

    move-result p1

    return p1
.end method

.method public final g(Ljava/lang/Object;[BIILandroidx/glance/appwidget/protobuf/d;)V
    .locals 0

    move-object p2, p1

    check-cast p2, Landroidx/glance/appwidget/protobuf/a0;

    iget-object p3, p2, Landroidx/glance/appwidget/protobuf/a0;->unknownFields:Landroidx/glance/appwidget/protobuf/e1;

    sget-object p4, Landroidx/glance/appwidget/protobuf/e1;->f:Landroidx/glance/appwidget/protobuf/e1;

    if-ne p3, p4, :cond_0

    invoke-static {}, Landroidx/glance/appwidget/protobuf/e1;->c()Landroidx/glance/appwidget/protobuf/e1;

    move-result-object p3

    iput-object p3, p2, Landroidx/glance/appwidget/protobuf/a0;->unknownFields:Landroidx/glance/appwidget/protobuf/e1;

    :cond_0
    invoke-static {p1}, Lnh3/a;->d(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1
.end method

.method public final h(Landroidx/glance/appwidget/protobuf/a0;)I
    .locals 7

    iget-object v0, p0, Landroidx/glance/appwidget/protobuf/t0;->b:Landroidx/glance/appwidget/protobuf/d1;

    check-cast v0, Landroidx/glance/appwidget/protobuf/f1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Landroidx/glance/appwidget/protobuf/a0;->unknownFields:Landroidx/glance/appwidget/protobuf/e1;

    iget v0, p1, Landroidx/glance/appwidget/protobuf/e1;->d:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p1, Landroidx/glance/appwidget/protobuf/e1;->a:I

    if-ge v0, v2, :cond_1

    iget-object v2, p1, Landroidx/glance/appwidget/protobuf/e1;->b:[I

    aget v2, v2, v0

    const/4 v3, 0x3

    ushr-int/2addr v2, v3

    iget-object v4, p1, Landroidx/glance/appwidget/protobuf/e1;->c:[Ljava/lang/Object;

    aget-object v4, v4, v0

    check-cast v4, Landroidx/glance/appwidget/protobuf/i;

    const/4 v5, 0x1

    invoke-static {v5}, Landroidx/glance/appwidget/protobuf/p;->i0(I)I

    move-result v5

    const/4 v6, 0x2

    mul-int/2addr v5, v6

    invoke-static {v6}, Landroidx/glance/appwidget/protobuf/p;->i0(I)I

    move-result v6

    invoke-static {v2}, Landroidx/glance/appwidget/protobuf/p;->j0(I)I

    move-result v2

    add-int/2addr v2, v6

    add-int/2addr v2, v5

    invoke-static {v3, v4}, Landroidx/glance/appwidget/protobuf/p;->e0(ILandroidx/glance/appwidget/protobuf/i;)I

    move-result v3

    add-int/2addr v3, v2

    add-int/2addr v1, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iput v1, p1, Landroidx/glance/appwidget/protobuf/e1;->d:I

    return v1
.end method

.method public final i(Ljava/lang/Object;Landroidx/glance/appwidget/protobuf/m0;)V
    .locals 0

    iget-object p2, p0, Landroidx/glance/appwidget/protobuf/t0;->c:Landroidx/glance/appwidget/protobuf/t;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lr;->t(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final j(Landroidx/glance/appwidget/protobuf/a0;Landroidx/glance/appwidget/protobuf/a0;)Z
    .locals 1

    iget-object v0, p0, Landroidx/glance/appwidget/protobuf/t0;->b:Landroidx/glance/appwidget/protobuf/d1;

    check-cast v0, Landroidx/glance/appwidget/protobuf/f1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Landroidx/glance/appwidget/protobuf/a0;->unknownFields:Landroidx/glance/appwidget/protobuf/e1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, p2, Landroidx/glance/appwidget/protobuf/a0;->unknownFields:Landroidx/glance/appwidget/protobuf/e1;

    invoke-virtual {p1, p2}, Landroidx/glance/appwidget/protobuf/e1;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.class public final Landroidx/datastore/preferences/protobuf/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/datastore/preferences/protobuf/l;

.field public b:I

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>(Landroidx/datastore/preferences/protobuf/l;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/datastore/preferences/protobuf/m;->d:I

    sget-object v0, Landroidx/datastore/preferences/protobuf/c0;->a:Ljava/nio/charset/Charset;

    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/m;->a:Landroidx/datastore/preferences/protobuf/l;

    iput-object p0, p1, Landroidx/datastore/preferences/protobuf/l;->y:Ljava/lang/Object;

    return-void
.end method

.method public static y(I)V
    .locals 1

    and-int/lit8 p0, p0, 0x3

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;

    const-string v0, "Failed to parse the message."

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static z(I)V
    .locals 1

    and-int/lit8 p0, p0, 0x7

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;

    const-string v0, "Failed to parse the message."

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a()I
    .locals 2

    iget v0, p0, Landroidx/datastore/preferences/protobuf/m;->d:I

    if-eqz v0, :cond_0

    iput v0, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    const/4 v0, 0x0

    iput v0, p0, Landroidx/datastore/preferences/protobuf/m;->d:I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/m;->a:Landroidx/datastore/preferences/protobuf/l;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iput v0, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    :goto_0
    iget v0, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    if-eqz v0, :cond_2

    iget v1, p0, Landroidx/datastore/preferences/protobuf/m;->c:I

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    ushr-int/lit8 v0, v0, 0x3

    return v0

    :cond_2
    :goto_1
    const v0, 0x7fffffff

    return v0
.end method

.method public final b(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/z0;Landroidx/datastore/preferences/protobuf/q;)V
    .locals 2

    iget v0, p0, Landroidx/datastore/preferences/protobuf/m;->c:I

    iget v1, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    ushr-int/lit8 v1, v1, 0x3

    shl-int/lit8 v1, v1, 0x3

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Landroidx/datastore/preferences/protobuf/m;->c:I

    :try_start_0
    invoke-interface {p2, p1, p0, p3}, Landroidx/datastore/preferences/protobuf/z0;->f(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/m;Landroidx/datastore/preferences/protobuf/q;)V

    iget p1, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    iget p2, p0, Landroidx/datastore/preferences/protobuf/m;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, p2, :cond_0

    iput v0, p0, Landroidx/datastore/preferences/protobuf/m;->c:I

    return-void

    :cond_0
    :try_start_1
    new-instance p1, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;

    const-string p2, "Failed to parse the message."

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    iput v0, p0, Landroidx/datastore/preferences/protobuf/m;->c:I

    throw p1
.end method

.method public final c(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/z0;Landroidx/datastore/preferences/protobuf/q;)V
    .locals 4

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/m;->a:Landroidx/datastore/preferences/protobuf/l;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v1

    iget v2, v0, Landroidx/datastore/preferences/protobuf/l;->x:I

    const/16 v3, 0x64

    if-ge v2, v3, :cond_0

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/l;->l(I)I

    move-result v1

    iget v2, v0, Landroidx/datastore/preferences/protobuf/l;->x:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v0, Landroidx/datastore/preferences/protobuf/l;->x:I

    invoke-interface {p2, p1, p0, p3}, Landroidx/datastore/preferences/protobuf/z0;->f(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/m;Landroidx/datastore/preferences/protobuf/q;)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroidx/datastore/preferences/protobuf/l;->a(I)V

    iget p1, v0, Landroidx/datastore/preferences/protobuf/l;->x:I

    add-int/lit8 p1, p1, -0x1

    iput p1, v0, Landroidx/datastore/preferences/protobuf/l;->x:I

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/l;->k(I)V

    return-void

    :cond_0
    new-instance p1, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;

    const-string p2, "Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit."

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final d(Landroidx/datastore/preferences/protobuf/b;)V
    .locals 4

    iget v0, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/m;->a:Landroidx/datastore/preferences/protobuf/l;

    if-eqz v0, :cond_2

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v0

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v2

    add-int/2addr v2, v0

    :cond_0
    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->m()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    move-object v3, p1

    check-cast v3, Landroidx/datastore/preferences/protobuf/x0;

    invoke-virtual {v3, v0}, Landroidx/datastore/preferences/protobuf/x0;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v0

    if-lt v0, v2, :cond_0

    invoke-virtual {p0, v2}, Landroidx/datastore/preferences/protobuf/m;->v(I)V

    return-void

    :cond_1
    invoke-static {}, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;->b()Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->m()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    move-object v2, p1

    check-cast v2, Landroidx/datastore/preferences/protobuf/x0;

    invoke-virtual {v2, v0}, Landroidx/datastore/preferences/protobuf/x0;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    :cond_3
    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iget v2, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    if-eq v0, v2, :cond_2

    iput v0, p0, Landroidx/datastore/preferences/protobuf/m;->d:I

    return-void
.end method

.method public final e()Landroidx/datastore/preferences/protobuf/h;
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/m;->w(I)V

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/m;->a:Landroidx/datastore/preferences/protobuf/l;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/l;->n()Landroidx/datastore/preferences/protobuf/h;

    move-result-object v0

    return-object v0
.end method

.method public final f(Landroidx/datastore/preferences/protobuf/b;)V
    .locals 2

    iget v0, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    :cond_0
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/m;->e()Landroidx/datastore/preferences/protobuf/h;

    move-result-object v0

    move-object v1, p1

    check-cast v1, Landroidx/datastore/preferences/protobuf/x0;

    invoke-virtual {v1, v0}, Landroidx/datastore/preferences/protobuf/x0;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/m;->a:Landroidx/datastore/preferences/protobuf/l;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iget v1, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    if-eq v0, v1, :cond_0

    iput v0, p0, Landroidx/datastore/preferences/protobuf/m;->d:I

    return-void

    :cond_2
    invoke-static {}, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;->b()Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1
.end method

.method public final g(Landroidx/datastore/preferences/protobuf/b;)V
    .locals 5

    iget v0, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x1

    iget-object v2, p0, Landroidx/datastore/preferences/protobuf/m;->a:Landroidx/datastore/preferences/protobuf/l;

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v0

    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/m;->z(I)V

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_0
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->q()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    move-object v3, p1

    check-cast v3, Landroidx/datastore/preferences/protobuf/x0;

    invoke-virtual {v3, v0}, Landroidx/datastore/preferences/protobuf/x0;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v0

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;->b()Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->q()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    move-object v1, p1

    check-cast v1, Landroidx/datastore/preferences/protobuf/x0;

    invoke-virtual {v1, v0}, Landroidx/datastore/preferences/protobuf/x0;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    :goto_0
    return-void

    :cond_3
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iget v1, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    if-eq v0, v1, :cond_2

    iput v0, p0, Landroidx/datastore/preferences/protobuf/m;->d:I

    return-void
.end method

.method public final h(Landroidx/datastore/preferences/protobuf/b;)V
    .locals 4

    iget v0, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/m;->a:Landroidx/datastore/preferences/protobuf/l;

    if-eqz v0, :cond_2

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v0

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v2

    add-int/2addr v2, v0

    :cond_0
    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->r()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v3, p1

    check-cast v3, Landroidx/datastore/preferences/protobuf/x0;

    invoke-virtual {v3, v0}, Landroidx/datastore/preferences/protobuf/x0;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v0

    if-lt v0, v2, :cond_0

    invoke-virtual {p0, v2}, Landroidx/datastore/preferences/protobuf/m;->v(I)V

    return-void

    :cond_1
    invoke-static {}, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;->b()Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->r()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v2, p1

    check-cast v2, Landroidx/datastore/preferences/protobuf/x0;

    invoke-virtual {v2, v0}, Landroidx/datastore/preferences/protobuf/x0;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    :cond_3
    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iget v2, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    if-eq v0, v2, :cond_2

    iput v0, p0, Landroidx/datastore/preferences/protobuf/m;->d:I

    return-void
.end method

.method public final i(Landroidx/datastore/preferences/protobuf/u1;Ljava/lang/Class;Landroidx/datastore/preferences/protobuf/q;)Ljava/lang/Object;
    .locals 5

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const/4 v0, 0x2

    const/4 v1, 0x5

    const/4 v2, 0x1

    const/4 v3, 0x0

    iget-object v4, p0, Landroidx/datastore/preferences/protobuf/m;->a:Landroidx/datastore/preferences/protobuf/l;

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "unsupported field type."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    invoke-virtual {p0, v3}, Landroidx/datastore/preferences/protobuf/m;->w(I)V

    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/l;->A()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0, v3}, Landroidx/datastore/preferences/protobuf/m;->w(I)V

    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/l;->z()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p0, v2}, Landroidx/datastore/preferences/protobuf/m;->w(I)V

    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/l;->y()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p0, v1}, Landroidx/datastore/preferences/protobuf/m;->w(I)V

    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/l;->x()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-virtual {p0, v3}, Landroidx/datastore/preferences/protobuf/m;->w(I)V

    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/l;->r()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-virtual {p0, v3}, Landroidx/datastore/preferences/protobuf/m;->w(I)V

    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/m;->e()Landroidx/datastore/preferences/protobuf/h;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/m;->w(I)V

    sget-object p1, Landroidx/datastore/preferences/protobuf/w0;->c:Landroidx/datastore/preferences/protobuf/w0;

    invoke-virtual {p1, p2}, Landroidx/datastore/preferences/protobuf/w0;->a(Ljava/lang/Class;)Landroidx/datastore/preferences/protobuf/z0;

    move-result-object p1

    invoke-interface {p1}, Landroidx/datastore/preferences/protobuf/z0;->d()Landroidx/datastore/preferences/protobuf/z;

    move-result-object p2

    invoke-virtual {p0, p2, p1, p3}, Landroidx/datastore/preferences/protobuf/m;->c(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/z0;Landroidx/datastore/preferences/protobuf/q;)V

    invoke-interface {p1, p2}, Landroidx/datastore/preferences/protobuf/z0;->b(Ljava/lang/Object;)V

    return-object p2

    :pswitch_9
    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/m;->w(I)V

    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/l;->C()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_a
    invoke-virtual {p0, v3}, Landroidx/datastore/preferences/protobuf/m;->w(I)V

    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/l;->m()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_b
    invoke-virtual {p0, v1}, Landroidx/datastore/preferences/protobuf/m;->w(I)V

    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/l;->s()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_c
    invoke-virtual {p0, v2}, Landroidx/datastore/preferences/protobuf/m;->w(I)V

    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/l;->t()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_d
    invoke-virtual {p0, v3}, Landroidx/datastore/preferences/protobuf/m;->w(I)V

    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/l;->v()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_e
    invoke-virtual {p0, v3}, Landroidx/datastore/preferences/protobuf/m;->w(I)V

    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/l;->F()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_f
    invoke-virtual {p0, v3}, Landroidx/datastore/preferences/protobuf/m;->w(I)V

    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/l;->w()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_10
    invoke-virtual {p0, v1}, Landroidx/datastore/preferences/protobuf/m;->w(I)V

    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/l;->u()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :pswitch_11
    invoke-virtual {p0, v2}, Landroidx/datastore/preferences/protobuf/m;->w(I)V

    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/l;->q()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final j(Landroidx/datastore/preferences/protobuf/b;)V
    .locals 4

    iget v0, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    iget-object v2, p0, Landroidx/datastore/preferences/protobuf/m;->a:Landroidx/datastore/preferences/protobuf/l;

    if-eq v0, v1, :cond_3

    const/4 v1, 0x5

    if-ne v0, v1, :cond_2

    :cond_0
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->s()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v1, p1

    check-cast v1, Landroidx/datastore/preferences/protobuf/x0;

    invoke-virtual {v1, v0}, Landroidx/datastore/preferences/protobuf/x0;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iget v1, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    if-eq v0, v1, :cond_0

    iput v0, p0, Landroidx/datastore/preferences/protobuf/m;->d:I

    return-void

    :cond_2
    invoke-static {}, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;->b()Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_3
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v0

    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/m;->y(I)V

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_4
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->s()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v3, p1

    check-cast v3, Landroidx/datastore/preferences/protobuf/x0;

    invoke-virtual {v3, v0}, Landroidx/datastore/preferences/protobuf/x0;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v0

    if-lt v0, v1, :cond_4

    :goto_0
    return-void
.end method

.method public final k(Landroidx/datastore/preferences/protobuf/b;)V
    .locals 5

    iget v0, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x1

    iget-object v2, p0, Landroidx/datastore/preferences/protobuf/m;->a:Landroidx/datastore/preferences/protobuf/l;

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v0

    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/m;->z(I)V

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_0
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->t()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object v3, p1

    check-cast v3, Landroidx/datastore/preferences/protobuf/x0;

    invoke-virtual {v3, v0}, Landroidx/datastore/preferences/protobuf/x0;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v0

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;->b()Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->t()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object v1, p1

    check-cast v1, Landroidx/datastore/preferences/protobuf/x0;

    invoke-virtual {v1, v0}, Landroidx/datastore/preferences/protobuf/x0;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    :goto_0
    return-void

    :cond_3
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iget v1, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    if-eq v0, v1, :cond_2

    iput v0, p0, Landroidx/datastore/preferences/protobuf/m;->d:I

    return-void
.end method

.method public final l(Landroidx/datastore/preferences/protobuf/b;)V
    .locals 4

    iget v0, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    iget-object v2, p0, Landroidx/datastore/preferences/protobuf/m;->a:Landroidx/datastore/preferences/protobuf/l;

    if-eq v0, v1, :cond_3

    const/4 v1, 0x5

    if-ne v0, v1, :cond_2

    :cond_0
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->u()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    move-object v1, p1

    check-cast v1, Landroidx/datastore/preferences/protobuf/x0;

    invoke-virtual {v1, v0}, Landroidx/datastore/preferences/protobuf/x0;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iget v1, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    if-eq v0, v1, :cond_0

    iput v0, p0, Landroidx/datastore/preferences/protobuf/m;->d:I

    return-void

    :cond_2
    invoke-static {}, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;->b()Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_3
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v0

    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/m;->y(I)V

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_4
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->u()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    move-object v3, p1

    check-cast v3, Landroidx/datastore/preferences/protobuf/x0;

    invoke-virtual {v3, v0}, Landroidx/datastore/preferences/protobuf/x0;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v0

    if-lt v0, v1, :cond_4

    :goto_0
    return-void
.end method

.method public final m(Landroidx/datastore/preferences/protobuf/b;)V
    .locals 4

    iget v0, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/m;->a:Landroidx/datastore/preferences/protobuf/l;

    if-eqz v0, :cond_2

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v0

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v2

    add-int/2addr v2, v0

    :cond_0
    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->v()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v3, p1

    check-cast v3, Landroidx/datastore/preferences/protobuf/x0;

    invoke-virtual {v3, v0}, Landroidx/datastore/preferences/protobuf/x0;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v0

    if-lt v0, v2, :cond_0

    invoke-virtual {p0, v2}, Landroidx/datastore/preferences/protobuf/m;->v(I)V

    return-void

    :cond_1
    invoke-static {}, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;->b()Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->v()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v2, p1

    check-cast v2, Landroidx/datastore/preferences/protobuf/x0;

    invoke-virtual {v2, v0}, Landroidx/datastore/preferences/protobuf/x0;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    :cond_3
    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iget v2, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    if-eq v0, v2, :cond_2

    iput v0, p0, Landroidx/datastore/preferences/protobuf/m;->d:I

    return-void
.end method

.method public final n(Landroidx/datastore/preferences/protobuf/b;)V
    .locals 5

    iget v0, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/m;->a:Landroidx/datastore/preferences/protobuf/l;

    if-eqz v0, :cond_2

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v0

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v2

    add-int/2addr v2, v0

    :cond_0
    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->w()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object v3, p1

    check-cast v3, Landroidx/datastore/preferences/protobuf/x0;

    invoke-virtual {v3, v0}, Landroidx/datastore/preferences/protobuf/x0;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v0

    if-lt v0, v2, :cond_0

    invoke-virtual {p0, v2}, Landroidx/datastore/preferences/protobuf/m;->v(I)V

    return-void

    :cond_1
    invoke-static {}, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;->b()Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->w()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object v2, p1

    check-cast v2, Landroidx/datastore/preferences/protobuf/x0;

    invoke-virtual {v2, v0}, Landroidx/datastore/preferences/protobuf/x0;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    :cond_3
    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iget v2, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    if-eq v0, v2, :cond_2

    iput v0, p0, Landroidx/datastore/preferences/protobuf/m;->d:I

    return-void
.end method

.method public final o(Landroidx/datastore/preferences/protobuf/b;)V
    .locals 4

    iget v0, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    iget-object v2, p0, Landroidx/datastore/preferences/protobuf/m;->a:Landroidx/datastore/preferences/protobuf/l;

    if-eq v0, v1, :cond_3

    const/4 v1, 0x5

    if-ne v0, v1, :cond_2

    :cond_0
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->x()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v1, p1

    check-cast v1, Landroidx/datastore/preferences/protobuf/x0;

    invoke-virtual {v1, v0}, Landroidx/datastore/preferences/protobuf/x0;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iget v1, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    if-eq v0, v1, :cond_0

    iput v0, p0, Landroidx/datastore/preferences/protobuf/m;->d:I

    return-void

    :cond_2
    invoke-static {}, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;->b()Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_3
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v0

    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/m;->y(I)V

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_4
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->x()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v3, p1

    check-cast v3, Landroidx/datastore/preferences/protobuf/x0;

    invoke-virtual {v3, v0}, Landroidx/datastore/preferences/protobuf/x0;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v0

    if-lt v0, v1, :cond_4

    :goto_0
    return-void
.end method

.method public final p(Landroidx/datastore/preferences/protobuf/b;)V
    .locals 5

    iget v0, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x1

    iget-object v2, p0, Landroidx/datastore/preferences/protobuf/m;->a:Landroidx/datastore/preferences/protobuf/l;

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v0

    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/m;->z(I)V

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_0
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->y()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object v3, p1

    check-cast v3, Landroidx/datastore/preferences/protobuf/x0;

    invoke-virtual {v3, v0}, Landroidx/datastore/preferences/protobuf/x0;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v0

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;->b()Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->y()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object v1, p1

    check-cast v1, Landroidx/datastore/preferences/protobuf/x0;

    invoke-virtual {v1, v0}, Landroidx/datastore/preferences/protobuf/x0;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    :goto_0
    return-void

    :cond_3
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iget v1, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    if-eq v0, v1, :cond_2

    iput v0, p0, Landroidx/datastore/preferences/protobuf/m;->d:I

    return-void
.end method

.method public final q(Landroidx/datastore/preferences/protobuf/b;)V
    .locals 4

    iget v0, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/m;->a:Landroidx/datastore/preferences/protobuf/l;

    if-eqz v0, :cond_2

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v0

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v2

    add-int/2addr v2, v0

    :cond_0
    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->z()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v3, p1

    check-cast v3, Landroidx/datastore/preferences/protobuf/x0;

    invoke-virtual {v3, v0}, Landroidx/datastore/preferences/protobuf/x0;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v0

    if-lt v0, v2, :cond_0

    invoke-virtual {p0, v2}, Landroidx/datastore/preferences/protobuf/m;->v(I)V

    return-void

    :cond_1
    invoke-static {}, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;->b()Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->z()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v2, p1

    check-cast v2, Landroidx/datastore/preferences/protobuf/x0;

    invoke-virtual {v2, v0}, Landroidx/datastore/preferences/protobuf/x0;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    :cond_3
    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iget v2, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    if-eq v0, v2, :cond_2

    iput v0, p0, Landroidx/datastore/preferences/protobuf/m;->d:I

    return-void
.end method

.method public final r(Landroidx/datastore/preferences/protobuf/b;)V
    .locals 5

    iget v0, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/m;->a:Landroidx/datastore/preferences/protobuf/l;

    if-eqz v0, :cond_2

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v0

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v2

    add-int/2addr v2, v0

    :cond_0
    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->A()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object v3, p1

    check-cast v3, Landroidx/datastore/preferences/protobuf/x0;

    invoke-virtual {v3, v0}, Landroidx/datastore/preferences/protobuf/x0;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v0

    if-lt v0, v2, :cond_0

    invoke-virtual {p0, v2}, Landroidx/datastore/preferences/protobuf/m;->v(I)V

    return-void

    :cond_1
    invoke-static {}, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;->b()Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->A()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object v2, p1

    check-cast v2, Landroidx/datastore/preferences/protobuf/x0;

    invoke-virtual {v2, v0}, Landroidx/datastore/preferences/protobuf/x0;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    :cond_3
    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iget v2, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    if-eq v0, v2, :cond_2

    iput v0, p0, Landroidx/datastore/preferences/protobuf/m;->d:I

    return-void
.end method

.method public final s(Landroidx/datastore/preferences/protobuf/b;Z)V
    .locals 4

    iget v0, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    :cond_0
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/m;->a:Landroidx/datastore/preferences/protobuf/l;

    if-eqz p2, :cond_1

    invoke-virtual {p0, v1}, Landroidx/datastore/preferences/protobuf/m;->w(I)V

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/l;->C()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v1}, Landroidx/datastore/preferences/protobuf/m;->w(I)V

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/l;->B()Ljava/lang/String;

    move-result-object v2

    :goto_0
    move-object v3, p1

    check-cast v3, Landroidx/datastore/preferences/protobuf/x0;

    invoke-virtual {v3, v2}, Landroidx/datastore/preferences/protobuf/x0;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v2

    if-eqz v2, :cond_2

    return-void

    :cond_2
    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iget v2, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    if-eq v0, v2, :cond_0

    iput v0, p0, Landroidx/datastore/preferences/protobuf/m;->d:I

    return-void

    :cond_3
    invoke-static {}, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;->b()Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1
.end method

.method public final t(Landroidx/datastore/preferences/protobuf/b;)V
    .locals 4

    iget v0, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/m;->a:Landroidx/datastore/preferences/protobuf/l;

    if-eqz v0, :cond_2

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v0

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v2

    add-int/2addr v2, v0

    :cond_0
    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v3, p1

    check-cast v3, Landroidx/datastore/preferences/protobuf/x0;

    invoke-virtual {v3, v0}, Landroidx/datastore/preferences/protobuf/x0;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v0

    if-lt v0, v2, :cond_0

    invoke-virtual {p0, v2}, Landroidx/datastore/preferences/protobuf/m;->v(I)V

    return-void

    :cond_1
    invoke-static {}, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;->b()Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v2, p1

    check-cast v2, Landroidx/datastore/preferences/protobuf/x0;

    invoke-virtual {v2, v0}, Landroidx/datastore/preferences/protobuf/x0;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    :cond_3
    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iget v2, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    if-eq v0, v2, :cond_2

    iput v0, p0, Landroidx/datastore/preferences/protobuf/m;->d:I

    return-void
.end method

.method public final u(Landroidx/datastore/preferences/protobuf/b;)V
    .locals 5

    iget v0, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/m;->a:Landroidx/datastore/preferences/protobuf/l;

    if-eqz v0, :cond_2

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v0

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v2

    add-int/2addr v2, v0

    :cond_0
    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->F()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object v3, p1

    check-cast v3, Landroidx/datastore/preferences/protobuf/x0;

    invoke-virtual {v3, v0}, Landroidx/datastore/preferences/protobuf/x0;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v0

    if-lt v0, v2, :cond_0

    invoke-virtual {p0, v2}, Landroidx/datastore/preferences/protobuf/m;->v(I)V

    return-void

    :cond_1
    invoke-static {}, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;->b()Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->F()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object v2, p1

    check-cast v2, Landroidx/datastore/preferences/protobuf/x0;

    invoke-virtual {v2, v0}, Landroidx/datastore/preferences/protobuf/x0;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    :cond_3
    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iget v2, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    if-eq v0, v2, :cond_2

    iput v0, p0, Landroidx/datastore/preferences/protobuf/m;->d:I

    return-void
.end method

.method public final v(I)V
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/m;->a:Landroidx/datastore/preferences/protobuf/l;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;->e()Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1
.end method

.method public final w(I)V
    .locals 1

    iget v0, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;->b()Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1
.end method

.method public final x()Z
    .locals 3

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/m;->a:Landroidx/datastore/preferences/protobuf/l;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v1

    if-nez v1, :cond_1

    iget v1, p0, Landroidx/datastore/preferences/protobuf/m;->b:I

    iget v2, p0, Landroidx/datastore/preferences/protobuf/m;->c:I

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/l;->H(I)Z

    move-result v0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

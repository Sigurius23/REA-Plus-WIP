.class public Lec3/h;
.super Lfc3/d;
.source "SourceFile"


# instance fields
.field public final E:Ljava/lang/Object;

.field public final synthetic z:I


# direct methods
.method public constructor <init>(Lc93/m;Lq83/j;ILdc3/a;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lec3/h;->z:I

    .line 3
    invoke-direct {p0, p2, p3, p4}, Lfc3/d;-><init>(Lq83/j;ILdc3/a;)V

    .line 4
    check-cast p1, Ls83/i;

    iput-object p1, p0, Lec3/h;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Iterable;Lq83/j;ILdc3/a;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lec3/h;->z:I

    .line 1
    invoke-direct {p0, p2, p3, p4}, Lfc3/d;-><init>(Lq83/j;ILdc3/a;)V

    .line 2
    iput-object p1, p0, Lec3/h;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public e(Ldc3/u;Lq83/d;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lec3/h;->z:I

    packed-switch v0, :pswitch_data_0

    new-instance p2, Lfc3/w;

    invoke-direct {p2, p1}, Lfc3/w;-><init>(Ldc3/u;)V

    iget-object v0, p0, Lec3/h;->E:Ljava/lang/Object;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lec3/l;

    new-instance v2, La6/c;

    const/16 v3, 0x10

    const/4 v4, 0x0

    invoke-direct {v2, v1, p2, v4, v3}, La6/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v1, 0x3

    invoke-static {p1, v4, v4, v2, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_0

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lec3/h;->E:Ljava/lang/Object;

    check-cast v0, Ls83/i;

    invoke-interface {v0, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    goto :goto_1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public f(Lq83/j;ILdc3/a;)Lfc3/d;
    .locals 2

    iget v0, p0, Lec3/h;->z:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lec3/h;

    iget-object v1, p0, Lec3/h;->E:Ljava/lang/Object;

    invoke-direct {v0, v1, p1, p2, p3}, Lec3/h;-><init>(Ljava/lang/Iterable;Lq83/j;ILdc3/a;)V

    return-object v0

    :pswitch_0
    new-instance v0, Lec3/h;

    iget-object v1, p0, Lec3/h;->E:Ljava/lang/Object;

    check-cast v1, Ls83/i;

    invoke-direct {v0, v1, p1, p2, p3}, Lec3/h;-><init>(Lc93/m;Lq83/j;ILdc3/a;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public h(Lbc3/c0;)Ldc3/w;
    .locals 5

    iget v0, p0, Lec3/h;->z:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Lfc3/d;->h(Lbc3/c0;)Ldc3/w;

    move-result-object p1

    return-object p1

    :pswitch_0
    new-instance v0, La6/c;

    const/4 v1, 0x0

    const/16 v2, 0xf

    invoke-direct {v0, p0, v1, v2}, La6/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    sget-object v1, Ldc3/a;->w:Ldc3/a;

    sget-object v2, Lbc3/d0;->w:Lbc3/d0;

    const/4 v3, 0x4

    iget v4, p0, Lfc3/d;->x:I

    invoke-static {v4, v3, v1}, Lq83/g;->d(IILdc3/a;)Ldc3/h;

    move-result-object v1

    iget-object v3, p0, Lfc3/d;->w:Lq83/j;

    invoke-static {p1, v3}, Lbc3/f0;->A(Lbc3/c0;Lq83/j;)Lq83/j;

    move-result-object p1

    new-instance v3, Ldc3/t;

    const/4 v4, 0x1

    invoke-direct {v3, p1, v1, v4, v4}, Ldc3/t;-><init>(Lq83/j;Ldc3/h;ZZ)V

    invoke-virtual {v3, v2, v3, v0}, Lbc3/a;->b0(Lbc3/d0;Lbc3/a;Lc93/m;)V

    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lec3/h;->z:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Lfc3/d;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "block["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lec3/h;->E:Ljava/lang/Object;

    check-cast v1, Ls83/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "] -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lfc3/d;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

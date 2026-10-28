.class public final Le10/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/d;


# instance fields
.field public final E:Lv03/h;

.field public final F:Lv03/h;

.field public final G:Lv03/h;

.field public final synthetic w:I

.field public final x:Lv03/h;

.field public final y:Lv03/h;

.field public final z:Lv03/h;


# direct methods
.method public constructor <init>(Lb10/c;Lv03/h;Lv03/h;Lv03/h;Lv03/h;La30/h;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Le10/s0;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Le10/s0;->F:Lv03/h;

    .line 4
    iput-object p2, p0, Le10/s0;->x:Lv03/h;

    .line 5
    iput-object p3, p0, Le10/s0;->y:Lv03/h;

    .line 6
    iput-object p4, p0, Le10/s0;->z:Lv03/h;

    .line 7
    iput-object p5, p0, Le10/s0;->E:Lv03/h;

    .line 8
    iput-object p6, p0, Le10/s0;->G:Lv03/h;

    return-void
.end method

.method public constructor <init>(Lv03/h;La30/h;Lv03/h;La30/c;Lv03/h;Lv03/h;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Le10/s0;->w:I

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Le10/s0;->x:Lv03/h;

    .line 11
    iput-object p2, p0, Le10/s0;->y:Lv03/h;

    .line 12
    iput-object p3, p0, Le10/s0;->z:Lv03/h;

    .line 13
    iput-object p4, p0, Le10/s0;->F:Lv03/h;

    .line 14
    iput-object p5, p0, Le10/s0;->E:Lv03/h;

    .line 15
    iput-object p6, p0, Le10/s0;->G:Lv03/h;

    return-void
.end method

.method public synthetic constructor <init>(Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/d;I)V
    .locals 0

    .line 1
    iput p7, p0, Le10/s0;->w:I

    iput-object p1, p0, Le10/s0;->x:Lv03/h;

    iput-object p2, p0, Le10/s0;->y:Lv03/h;

    iput-object p3, p0, Le10/s0;->z:Lv03/h;

    iput-object p4, p0, Le10/s0;->E:Lv03/h;

    iput-object p5, p0, Le10/s0;->F:Lv03/h;

    iput-object p6, p0, Le10/s0;->G:Lv03/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 9

    iget v0, p0, Le10/s0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Le10/s0;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lb00/a;

    iget-object v0, p0, Le10/s0;->y:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Le00/w;

    iget-object v0, p0, Le10/s0;->z:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lt40/f;

    iget-object v0, p0, Le10/s0;->E:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lb20/f;

    iget-object v0, p0, Le10/s0;->F:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lwz/g0;

    iget-object v0, p0, Le10/s0;->G:Lv03/h;

    check-cast v0, La30/h;

    invoke-virtual {v0}, La30/h;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    new-instance v1, Lxz/e0;

    invoke-direct/range {v1 .. v7}, Lxz/e0;-><init>(Lb00/a;Le00/w;Lt40/f;Lb20/f;Lwz/g0;Ljava/lang/String;)V

    return-object v1

    :pswitch_0
    iget-object v0, p0, Le10/s0;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lwz/l1;

    iget-object v0, p0, Le10/s0;->y:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ls10/f;

    iget-object v0, p0, Le10/s0;->z:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lzx/o;

    iget-object v0, p0, Le10/s0;->E:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroidx/lifecycle/k1;

    iget-object v0, p0, Le10/s0;->F:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    iget-object v0, p0, Le10/s0;->G:Lv03/h;

    check-cast v0, Lay/w;

    invoke-virtual {v0}, Lay/w;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lny/d;

    new-instance v1, Ls10/e;

    invoke-direct/range {v1 .. v7}, Ls10/e;-><init>(Lwz/l1;Ls10/f;Lzx/o;Landroidx/lifecycle/k1;Ljava/lang/String;Lny/d;)V

    return-object v1

    :pswitch_1
    iget-object v0, p0, Le10/s0;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lb20/f;

    iget-object v0, p0, Le10/s0;->y:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lt40/f;

    iget-object v0, p0, Le10/s0;->z:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lq83/j;

    iget-object v0, p0, Le10/s0;->F:Lv03/h;

    check-cast v0, La30/c;

    invoke-virtual {v0}, La30/c;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lq30/w0;

    iget-object v0, p0, Le10/s0;->E:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lc93/a;

    iget-object v0, p0, Le10/s0;->G:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/Set;

    new-instance v1, Lf10/b;

    sget-object v4, Lbc3/e1;->w:Lbc3/e1;

    invoke-direct/range {v1 .. v8}, Lf10/b;-><init>(Lb20/f;Lt40/f;Lbc3/c0;Lq83/j;Lq30/w0;Lc93/a;Ljava/util/Set;)V

    return-object v1

    :pswitch_2
    iget-object v0, p0, Le10/s0;->F:Lv03/h;

    check-cast v0, Lb10/c;

    invoke-virtual {v0}, Lb10/c;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lab/g;

    iget-object v0, p0, Le10/s0;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroidx/lifecycle/k1;

    iget-object v0, p0, Le10/s0;->y:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lb20/f;

    iget-object v0, p0, Le10/s0;->z:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lq83/j;

    iget-object v0, p0, Le10/s0;->E:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lqy/d;

    iget-object v0, p0, Le10/s0;->G:Lv03/h;

    check-cast v0, La30/h;

    invoke-virtual {v0}, La30/h;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Le10/k0;

    new-instance v1, Le10/n0;

    invoke-direct/range {v1 .. v7}, Le10/n0;-><init>(Lab/g;Landroidx/lifecycle/k1;Lb20/f;Lq83/j;Lqy/d;Le10/k0;)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

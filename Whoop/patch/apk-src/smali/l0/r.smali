.class public final synthetic Ll0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:Ly2/t0;


# direct methods
.method public synthetic constructor <init>(Ly2/j1;Ly2/q0;Ly2/t0;IILl0/t;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Ll0/r;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll0/r;->E:Ljava/lang/Object;

    iput-object p2, p0, Ll0/r;->F:Ljava/lang/Object;

    iput-object p3, p0, Ll0/r;->z:Ly2/t0;

    iput p4, p0, Ll0/r;->x:I

    iput p5, p0, Ll0/r;->y:I

    iput-object p6, p0, Ll0/r;->G:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>([Ly2/j1;Ll0/x;IILy2/t0;[I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Ll0/r;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll0/r;->E:Ljava/lang/Object;

    iput-object p2, p0, Ll0/r;->F:Ljava/lang/Object;

    iput p3, p0, Ll0/r;->x:I

    iput p4, p0, Ll0/r;->y:I

    iput-object p5, p0, Ll0/r;->z:Ly2/t0;

    iput-object p6, p0, Ll0/r;->G:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Ll0/r;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll0/r;->E:Ljava/lang/Object;

    check-cast v0, [Ly2/j1;

    iget-object v1, p0, Ll0/r;->F:Ljava/lang/Object;

    check-cast v1, Ll0/x;

    iget-object v2, p0, Ll0/r;->G:Ljava/lang/Object;

    check-cast v2, [I

    check-cast p1, Ly2/i1;

    array-length v3, v0

    const/4 v4, 0x0

    move v5, v4

    move v6, v5

    :goto_0
    if-ge v5, v3, :cond_3

    aget-object v7, v0, v5

    add-int/lit8 v8, v6, 0x1

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v7}, Ly2/j1;->p()Ljava/lang/Object;

    move-result-object v9

    instance-of v10, v9, Ll0/o1;

    const/4 v11, 0x0

    if-eqz v10, :cond_0

    check-cast v9, Ll0/o1;

    goto :goto_1

    :cond_0
    move-object v9, v11

    :goto_1
    iget-object v10, p0, Ll0/r;->z:Ly2/t0;

    invoke-interface {v10}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v10

    if-eqz v9, :cond_1

    iget-object v11, v9, Ll0/o1;->c:Ll0/f;

    :cond_1
    iget v9, p0, Ll0/r;->x:I

    if-eqz v11, :cond_2

    iget v12, v7, Ly2/j1;->w:I

    sub-int/2addr v9, v12

    iget v12, p0, Ll0/r;->y:I

    invoke-virtual {v11, v9, v10, v7, v12}, Ll0/f;->d(ILy3/m;Ly2/j1;I)I

    move-result v9

    goto :goto_2

    :cond_2
    iget-object v11, v1, Ll0/x;->b:Lb2/f;

    iget v12, v7, Ly2/j1;->w:I

    sub-int/2addr v9, v12

    invoke-interface {v11, v4, v9, v10}, Lb2/f;->a(IILy3/m;)I

    move-result v9

    :goto_2
    aget v6, v2, v6

    invoke-static {v7, v9, v6, p1}, Ly2/i1;->g(Ly2/j1;IILy2/i1;)V

    add-int/lit8 v5, v5, 0x1

    move v6, v8

    goto :goto_0

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ll0/r;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ly2/j1;

    iget-object v0, p0, Ll0/r;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ly2/q0;

    iget-object v0, p0, Ll0/r;->G:Ljava/lang/Object;

    check-cast v0, Ll0/t;

    move-object v1, p1

    check-cast v1, Ly2/i1;

    iget-object p1, p0, Ll0/r;->z:Ly2/t0;

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v4

    iget-object v7, v0, Ll0/t;->a:Lb2/h;

    iget v5, p0, Ll0/r;->x:I

    iget v6, p0, Ll0/r;->y:I

    invoke-static/range {v1 .. v7}, Ll0/q;->b(Ly2/i1;Ly2/j1;Ly2/q0;Ly3/m;IILb2/h;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

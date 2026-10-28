.class public final Lhb3/w;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;

.field public final y:Ljava/lang/Object;

.field public final z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lhb3/w;->w:I

    iput-object p1, p0, Lhb3/w;->x:Ljava/lang/Object;

    iput-object p2, p0, Lhb3/w;->y:Ljava/lang/Object;

    iput-object p3, p0, Lhb3/w;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lhb3/w;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lhb3/w;->y:Ljava/lang/Object;

    check-cast v1, Lce/b0;

    check-cast v1, Lce/y;

    iget-object v1, v1, Lce/y;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\' defined multiple times in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lhb3/w;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/g0;

    iget-object v2, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v2, Lce/z;

    invoke-static {v2}, Lx43/j;->n(Lce/z;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " \'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Lce/z;

    iget-object v1, v1, Lce/z;->a:Ljava/lang/String;

    const/16 v2, 0x27

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lhb3/w;->x:Ljava/lang/Object;

    check-cast v1, Lce/m;

    iget v1, v1, Lce/m;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1, v0}, Lbp/b;->o(Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lhb3/w;->x:Ljava/lang/Object;

    check-cast v0, Lhb3/x;

    iget-object v1, p0, Lhb3/w;->y:Ljava/lang/Object;

    check-cast v1, Lqa3/k0;

    iget-object v2, p0, Lhb3/w;->z:Ljava/lang/Object;

    check-cast v2, Ljb3/s;

    iget-object v3, v0, Lhb3/x;->a:Lhb3/k;

    iget-object v4, v3, Lhb3/k;->c:Lr93/k;

    invoke-virtual {v0, v4}, Lhb3/x;->a(Lr93/k;)Lhb3/a0;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v3, v3, Lhb3/k;->a:Lhb3/i;

    iget-object v3, v3, Lhb3/i;->e:Lhb3/a;

    invoke-virtual {v2}, Lu93/m0;->getReturnType()Llb3/y;

    move-result-object v2

    const-string v4, "getReturnType(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v3, v0, v1, v2}, Lhb3/a;->z(Lhb3/a0;Lqa3/k0;Llb3/y;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lab3/g;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lhb3/w;->x:Ljava/lang/Object;

    check-cast v0, Lhb3/x;

    iget-object v1, p0, Lhb3/w;->y:Ljava/lang/Object;

    check-cast v1, Lqa3/k0;

    iget-object v2, p0, Lhb3/w;->z:Ljava/lang/Object;

    check-cast v2, Ljb3/s;

    iget-object v3, v0, Lhb3/x;->a:Lhb3/k;

    iget-object v4, v3, Lhb3/k;->c:Lr93/k;

    invoke-virtual {v0, v4}, Lhb3/x;->a(Lr93/k;)Lhb3/a0;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v3, v3, Lhb3/k;->a:Lhb3/i;

    iget-object v3, v3, Lhb3/i;->e:Lhb3/a;

    invoke-virtual {v2}, Lu93/m0;->getReturnType()Llb3/y;

    move-result-object v2

    const-string v4, "getReturnType(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v3, v0, v1, v2}, Lhb3/a;->t(Lhb3/a0;Lqa3/k0;Llb3/y;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lab3/g;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

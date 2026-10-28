.class public final Lja3/x;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final x:Lja3/a0;

.field public final y:Lx93/t;

.field public final z:Lkotlin/jvm/internal/g0;


# direct methods
.method public synthetic constructor <init>(Lja3/a0;Lx93/t;Lkotlin/jvm/internal/g0;I)V
    .locals 0

    iput p4, p0, Lja3/x;->w:I

    iput-object p1, p0, Lja3/x;->x:Lja3/a0;

    iput-object p2, p0, Lja3/x;->y:Lx93/t;

    iput-object p3, p0, Lja3/x;->z:Lkotlin/jvm/internal/g0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lja3/x;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lja3/x;->x:Lja3/a0;

    iget-object v0, v0, Lja3/a0;->b:Lzt/q;

    iget-object v0, v0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lia3/a;

    iget-object v0, v0, Lia3/a;->h:Lga3/h;

    iget-object v1, p0, Lja3/x;->z:Lkotlin/jvm/internal/g0;

    iget-object v1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Lr93/n0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "field"

    iget-object v2, p0, Lja3/x;->y:Lx93/t;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lja3/x;->x:Lja3/a0;

    iget-object v1, v0, Lja3/a0;->b:Lzt/q;

    iget-object v1, v1, Lzt/q;->x:Ljava/lang/Object;

    check-cast v1, Lia3/a;

    iget-object v1, v1, Lia3/a;->a:Lkb3/n;

    new-instance v2, Lja3/x;

    const/4 v3, 0x1

    iget-object v4, p0, Lja3/x;->y:Lx93/t;

    iget-object v5, p0, Lja3/x;->z:Lkotlin/jvm/internal/g0;

    invoke-direct {v2, v0, v4, v5, v3}, Lja3/x;-><init>(Lja3/a0;Lx93/t;Lkotlin/jvm/internal/g0;I)V

    check-cast v1, Lkb3/k;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lkb3/h;

    invoke-direct {v0, v1, v2}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

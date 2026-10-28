.class public final Lxa3/f;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final x:Lxa3/i;

.field public final y:Lo93/h;


# direct methods
.method public synthetic constructor <init>(Lxa3/i;Lo93/h;I)V
    .locals 0

    iput p3, p0, Lxa3/f;->w:I

    iput-object p1, p0, Lxa3/f;->x:Lxa3/i;

    iput-object p2, p0, Lxa3/f;->y:Lo93/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lxa3/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lxa3/f;->x:Lxa3/i;

    iget-object v1, v0, Lxa3/i;->a:Lxa3/l;

    iget-object v2, v1, Lxa3/l;->b:Le4/c;

    sget-object v3, Lxa3/l;->Y:[Lj93/z;

    const/4 v4, 0x0

    aget-object v3, v3, v4

    invoke-interface {v2, v1, v3}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxa3/c;

    iget-object v2, p0, Lxa3/f;->y:Lo93/h;

    const-string v3, "Array"

    invoke-virtual {v2, v3}, Lo93/h;->k(Ljava/lang/String;)Lr93/e;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Lxa3/c;->a(Lr93/h;Lxa3/i;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lyb3/r;->I0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lxa3/f;->x:Lxa3/i;

    iget-object v1, v0, Lxa3/i;->a:Lxa3/l;

    iget-object v2, v1, Lxa3/l;->b:Le4/c;

    sget-object v3, Lxa3/l;->Y:[Lj93/z;

    const/4 v4, 0x0

    aget-object v3, v3, v4

    invoke-interface {v2, v1, v3}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxa3/c;

    sget-object v2, Lo93/m;->C:Lva3/e;

    iget-object v3, p0, Lxa3/f;->y:Lo93/h;

    invoke-virtual {v3, v2}, Lo93/h;->j(Lva3/e;)Lr93/e;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Lxa3/c;->a(Lr93/h;Lxa3/i;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Collection"

    invoke-static {v0, v1}, Lyb3/r;->I0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

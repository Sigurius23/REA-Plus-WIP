.class public final Lhb3/s;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final x:Lhb3/x;

.field public final y:Lwa3/v;

.field public final z:I


# direct methods
.method public synthetic constructor <init>(Lhb3/x;Lwa3/v;II)V
    .locals 0

    iput p4, p0, Lhb3/s;->w:I

    iput-object p1, p0, Lhb3/s;->x:Lhb3/x;

    iput-object p2, p0, Lhb3/s;->y:Lwa3/v;

    iput p3, p0, Lhb3/s;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lhb3/s;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhb3/s;->x:Lhb3/x;

    iget-object v1, v0, Lhb3/x;->a:Lhb3/k;

    iget-object v2, v1, Lhb3/k;->c:Lr93/k;

    invoke-virtual {v0, v2}, Lhb3/x;->a(Lr93/k;)Lhb3/a0;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, v1, Lhb3/k;->a:Lhb3/i;

    iget-object v1, v1, Lhb3/i;->e:Lhb3/a;

    iget-object v2, p0, Lhb3/s;->y:Lwa3/v;

    iget v3, p0, Lhb3/s;->z:I

    invoke-interface {v1, v0, v2, v3}, Lhb3/c;->h(Lhb3/a0;Lwa3/v;I)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_1
    return-object v0

    :pswitch_0
    iget-object v0, p0, Lhb3/s;->x:Lhb3/x;

    iget-object v1, v0, Lhb3/x;->a:Lhb3/k;

    iget-object v2, v1, Lhb3/k;->c:Lr93/k;

    invoke-virtual {v0, v2}, Lhb3/x;->a(Lr93/k;)Lhb3/a0;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, v1, Lhb3/k;->a:Lhb3/i;

    iget-object v1, v1, Lhb3/i;->e:Lhb3/a;

    iget-object v2, p0, Lhb3/s;->y:Lwa3/v;

    iget v3, p0, Lhb3/s;->z:I

    invoke-interface {v1, v0, v2, v3}, Lhb3/c;->q(Lhb3/a0;Lwa3/v;I)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_3

    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_3
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

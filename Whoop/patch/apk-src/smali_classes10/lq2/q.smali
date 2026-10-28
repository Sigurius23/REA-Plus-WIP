.class public final synthetic Llq2/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;

.field public final synthetic y:Lp1/c1;

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;Lp1/c1;Lp1/c1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Llq2/q;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llq2/q;->z:Lc93/a;

    iput-object p2, p0, Llq2/q;->x:Lp1/c1;

    iput-object p3, p0, Llq2/q;->y:Lp1/c1;

    return-void
.end method

.method public synthetic constructor <init>(Lp1/c1;Lp1/c1;Lc93/a;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Llq2/q;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llq2/q;->x:Lp1/c1;

    iput-object p2, p0, Llq2/q;->y:Lp1/c1;

    iput-object p3, p0, Llq2/q;->z:Lc93/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Llq2/q;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lq0/n;

    iget-object v1, p0, Llq2/q;->x:Lp1/c1;

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc93/n;

    iget-object v2, p0, Llq2/q;->y:Lp1/c1;

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Llq2/q;->z:Lc93/a;

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lq0/n;-><init>(Lc93/n;Lkotlin/jvm/functions/Function1;I)V

    return-object v0

    :pswitch_0
    iget-object v0, p0, Llq2/q;->x:Lp1/c1;

    iget-object v1, p0, Llq2/q;->y:Lp1/c1;

    iget-object v2, p0, Llq2/q;->z:Lc93/a;

    invoke-static {v2, v0, v1}, Llq2/r;->t(Lc93/a;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

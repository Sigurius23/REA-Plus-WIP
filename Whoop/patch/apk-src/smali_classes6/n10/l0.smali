.class public final Ln10/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/d;


# instance fields
.field public final E:Lv03/h;

.field public final F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final x:Lv03/h;

.field public final y:Lv03/h;

.field public final z:Lv03/h;


# direct methods
.method public constructor <init>(Lb10/a1;Lp20/i;Lv03/h;Lb10/c;La30/h;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Ln10/l0;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ln10/l0;->x:Lv03/h;

    .line 3
    iput-object p2, p0, Ln10/l0;->y:Lv03/h;

    .line 4
    iput-object p3, p0, Ln10/l0;->z:Lv03/h;

    .line 5
    iput-object p4, p0, Ln10/l0;->F:Ljava/lang/Object;

    .line 6
    iput-object p5, p0, Ln10/l0;->E:Lv03/h;

    return-void
.end method

.method public constructor <init>(Lg73/d;Lv03/h;Lv03/h;Lv03/d;Lv03/h;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ln10/l0;->w:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Ln10/l0;->F:Ljava/lang/Object;

    .line 9
    iput-object p2, p0, Ln10/l0;->x:Lv03/h;

    .line 10
    iput-object p3, p0, Ln10/l0;->y:Lv03/h;

    .line 11
    iput-object p4, p0, Ln10/l0;->z:Lv03/h;

    .line 12
    iput-object p5, p0, Ln10/l0;->E:Lv03/h;

    return-void
.end method

.method public constructor <init>(Lv03/e;Lv03/e;Lb10/a1;Lv03/h;Lv03/h;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ln10/l0;->w:I

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Ln10/l0;->x:Lv03/h;

    .line 15
    iput-object p2, p0, Ln10/l0;->y:Lv03/h;

    .line 16
    iput-object p3, p0, Ln10/l0;->F:Ljava/lang/Object;

    .line 17
    iput-object p4, p0, Ln10/l0;->z:Lv03/h;

    .line 18
    iput-object p5, p0, Ln10/l0;->E:Lv03/h;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 7

    iget v0, p0, Ln10/l0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln10/l0;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lb10/c1;

    iget-object v0, p0, Ln10/l0;->z:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lq83/j;

    iget-object v0, p0, Ln10/l0;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lb10/c;

    iget-object v0, p0, Ln10/l0;->E:Lv03/h;

    check-cast v0, La30/h;

    invoke-virtual {v0}, La30/h;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    new-instance v1, Lz20/l;

    iget-object v3, p0, Ln10/l0;->y:Lv03/h;

    invoke-direct/range {v1 .. v6}, Lz20/l;-><init>(Lb10/c1;Lk83/a;Lq83/j;Lb10/c;Ljava/lang/String;)V

    return-object v1

    :pswitch_0
    iget-object v0, p0, Ln10/l0;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    iget-object v0, p0, Ln10/l0;->y:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lc93/a;

    iget-object v0, p0, Ln10/l0;->F:Ljava/lang/Object;

    check-cast v0, Lb10/a1;

    invoke-virtual {v0}, Lb10/a1;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lb10/c1;

    iget-object v0, p0, Ln10/l0;->z:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lqy/d;

    iget-object v0, p0, Ln10/l0;->E:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lq83/j;

    new-instance v1, Lv10/k;

    invoke-direct/range {v1 .. v6}, Lv10/k;-><init>(Landroid/content/Context;Lc93/a;Lb10/c1;Lqy/d;Lq83/j;)V

    return-object v1

    :pswitch_1
    iget-object v0, p0, Ln10/l0;->F:Ljava/lang/Object;

    check-cast v0, Lg73/d;

    iget-object v1, p0, Ln10/l0;->x:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln10/h0;

    iget-object v2, p0, Ln10/l0;->y:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg20/x;

    iget-object v3, p0, Ln10/l0;->z:Lv03/h;

    invoke-interface {v3}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "interceptorFactory"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripePaymentLauncherAssistedFactory"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentConfigurationProvider"

    iget-object v4, p0, Ln10/l0;->E:Lv03/h;

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lj10/a;

    new-instance v5, Ljs2/h;

    const/16 v6, 0x19

    invoke-direct {v5, v2, v3, v4, v6}, Ljs2/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-direct {v0, v1, v5}, Lj10/a;-><init>(Ln10/h0;Ljs2/h;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

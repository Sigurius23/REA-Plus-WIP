.class public final Lj8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/r1;


# direct methods
.method public synthetic constructor <init>(Lp1/r1;I)V
    .locals 0

    iput p2, p0, Lj8/a;->w:I

    iput-object p1, p0, Lj8/a;->x:Lp1/r1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 1

    iget p2, p0, Lj8/a;->w:I

    packed-switch p2, :pswitch_data_0

    iget-object p2, p0, Lj8/a;->x:Lp1/r1;

    invoke-interface {p2, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object p2, p0, Lj8/a;->x:Lp1/r1;

    invoke-interface {p2, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    iget-object p2, p0, Lj8/a;->x:Lp1/r1;

    invoke-interface {p2, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    iget-object p2, p0, Lj8/a;->x:Lp1/r1;

    invoke-interface {p2, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    iget-object p2, p0, Lj8/a;->x:Lp1/r1;

    invoke-interface {p2, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

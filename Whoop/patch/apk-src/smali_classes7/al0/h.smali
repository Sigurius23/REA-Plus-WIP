.class public final synthetic Lal0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lv53/c;


# direct methods
.method public synthetic constructor <init>(Lv53/c;I)V
    .locals 0

    iput p2, p0, Lal0/h;->w:I

    iput-object p1, p0, Lal0/h;->x:Lv53/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lal0/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lal0/h;->x:Lv53/c;

    invoke-static {v0}, Lt52/a;->d(Lv53/c;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lal0/h;->x:Lv53/c;

    invoke-static {v0}, Lni0/c;->a(Lv53/c;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lal0/h;->x:Lv53/c;

    invoke-static {v0}, Lni0/c;->l(Lv53/c;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lal0/h;->x:Lv53/c;

    invoke-static {v0}, Lni0/c;->I(Lv53/c;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lal0/h;->x:Lv53/c;

    invoke-static {v0}, Lal0/j;->s0(Lv53/c;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

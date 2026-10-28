.class public final Ln10/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Lv03/h;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ln10/n0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lb20/g;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ln10/n0;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Ln10/n0;->b:Lv03/h;

    return-void
.end method


# virtual methods
.method public a()Lyz/a;
    .locals 1

    iget v0, p0, Ln10/n0;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln10/n0;->b:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyz/a;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ln10/n0;->b:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyz/a;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Ln10/n0;->b:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyz/a;

    return-object v0

    :pswitch_2
    iget-object v0, p0, Ln10/n0;->b:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyz/a;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

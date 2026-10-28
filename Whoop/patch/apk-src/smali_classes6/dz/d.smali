.class public final Ldz/d;
.super Ldz/i;
.source "SourceFile"


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ldz/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 1

    iget v0, p0, Ldz/d;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lm83/z;->w:Lm83/z;

    return-object v0

    :pswitch_0
    sget-object v0, Lm83/z;->w:Lm83/z;

    return-object v0

    :pswitch_1
    sget-object v0, Lm83/z;->w:Lm83/z;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget v0, p0, Ldz/d;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "cs_select_payment_method_screen_edit_tapped"

    return-object v0

    :pswitch_0
    const-string v0, "cs_select_payment_method_screen_done_tapped"

    return-object v0

    :pswitch_1
    const-string v0, "cs_card_number_completed"

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final Ldz/h;
.super Ldz/i;
.source "SourceFile"


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ldz/k;I)V
    .locals 1

    iput p2, p0, Ldz/h;->w:I

    packed-switch p2, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p2, Ldz/g;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p2, p2, v0

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    const-string p1, "cs_cancel_edit_screen"

    iput-object p1, p0, Ldz/h;->x:Ljava/lang/String;

    return-void

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    const-string v0, " has no supported event for hiding screen!"

    invoke-static {p1, v0}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_3

    const/4 p2, 0x1

    if-eq p1, p2, :cond_2

    const/4 p2, 0x2

    if-ne p1, p2, :cond_1

    const-string p1, "cs_open_edit_screen"

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    const-string p1, "cs_select_payment_method_screen_presented"

    goto :goto_0

    :cond_3
    const-string p1, "cs_add_payment_method_screen_presented"

    :goto_0
    iput-object p1, p0, Ldz/h;->x:Ljava/lang/String;

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 1

    iget v0, p0, Ldz/h;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lm83/z;->w:Lm83/z;

    return-object v0

    :pswitch_0
    sget-object v0, Lm83/z;->w:Lm83/z;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget v0, p0, Ldz/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ldz/h;->x:Ljava/lang/String;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ldz/h;->x:Ljava/lang/String;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

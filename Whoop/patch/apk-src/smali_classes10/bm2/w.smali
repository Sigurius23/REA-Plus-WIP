.class public final synthetic Lbm2/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lbm2/w;->w:I

    iput-object p1, p0, Lbm2/w;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lbm2/w;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbm2/w;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lbm2/q0;->b(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lbm2/w;->x:Ljava/lang/Object;

    check-cast v0, Landroid/app/DatePickerDialog;

    invoke-static {v0}, Lbm2/z0;->h(Landroid/app/DatePickerDialog;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lbm2/w;->x:Ljava/lang/Object;

    check-cast v0, Landroid/app/DatePickerDialog;

    invoke-static {v0}, Lbm2/e0;->t(Landroid/app/DatePickerDialog;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

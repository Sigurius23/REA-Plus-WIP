.class public final synthetic Ld42/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroid/app/DatePickerDialog;


# direct methods
.method public synthetic constructor <init>(Landroid/app/DatePickerDialog;I)V
    .locals 0

    iput p2, p0, Ld42/i;->w:I

    iput-object p1, p0, Ld42/i;->x:Landroid/app/DatePickerDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ld42/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld42/i;->x:Landroid/app/DatePickerDialog;

    invoke-static {v0}, Lep1/q;->p(Landroid/app/DatePickerDialog;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ld42/i;->x:Landroid/app/DatePickerDialog;

    invoke-static {v0}, Ld42/j;->c(Landroid/app/DatePickerDialog;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

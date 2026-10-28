.class public final synthetic Ld42/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/DatePickerDialog$OnDateSetListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/Calendar;

.field public final synthetic c:Ljava/text/SimpleDateFormat;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Calendar;Ljava/text/SimpleDateFormat;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p4, p0, Ld42/m;->a:I

    iput-object p1, p0, Ld42/m;->b:Ljava/util/Calendar;

    iput-object p2, p0, Ld42/m;->c:Ljava/text/SimpleDateFormat;

    iput-object p3, p0, Ld42/m;->d:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDateSet(Landroid/widget/DatePicker;III)V
    .locals 11

    iget v0, p0, Ld42/m;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v2, p0, Ld42/m;->c:Ljava/text/SimpleDateFormat;

    iget-object v3, p0, Ld42/m;->d:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ld42/m;->b:Ljava/util/Calendar;

    move-object v4, p1

    move v5, p2

    move v6, p3

    move v7, p4

    invoke-static/range {v1 .. v7}, Lvp1/h;->U(Ljava/util/Calendar;Ljava/text/SimpleDateFormat;Lkotlin/jvm/functions/Function1;Landroid/widget/DatePicker;III)V

    return-void

    :pswitch_0
    move-object v4, p1

    move v5, p2

    move v6, p3

    move v7, p4

    iget-object p1, p0, Ld42/m;->c:Ljava/text/SimpleDateFormat;

    move v9, v6

    iget-object v6, p0, Ld42/m;->d:Lkotlin/jvm/functions/Function1;

    move v10, v7

    move-object v7, v4

    iget-object v4, p0, Ld42/m;->b:Ljava/util/Calendar;

    move v8, v5

    move-object v5, p1

    invoke-static/range {v4 .. v10}, Ld42/p;->w(Ljava/util/Calendar;Ljava/text/SimpleDateFormat;Lkotlin/jvm/functions/Function1;Landroid/widget/DatePicker;III)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

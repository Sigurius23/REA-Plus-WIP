.class public final synthetic Ld42/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/DatePickerDialog$OnDateSetListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/Calendar;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Calendar;Ljava/lang/Object;Lp1/c1;I)V
    .locals 0

    iput p4, p0, Ld42/e;->a:I

    iput-object p1, p0, Ld42/e;->b:Ljava/util/Calendar;

    iput-object p2, p0, Ld42/e;->c:Ljava/lang/Object;

    iput-object p3, p0, Ld42/e;->d:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDateSet(Landroid/widget/DatePicker;III)V
    .locals 11

    iget v0, p0, Ld42/e;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld42/e;->c:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Ld42/e;->d:Lp1/c1;

    iget-object v1, p0, Ld42/e;->b:Ljava/util/Calendar;

    move-object v4, p1

    move v5, p2

    move v6, p3

    move v7, p4

    invoke-static/range {v1 .. v7}, Lbm2/z0;->q(Ljava/util/Calendar;Lkotlin/jvm/functions/Function1;Lp1/c1;Landroid/widget/DatePicker;III)V

    return-void

    :pswitch_0
    move-object v7, p1

    move v8, p2

    move v9, p3

    move v10, p4

    iget-object p1, p0, Ld42/e;->c:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ljava/text/SimpleDateFormat;

    iget-object v6, p0, Ld42/e;->d:Lp1/c1;

    iget-object v4, p0, Ld42/e;->b:Ljava/util/Calendar;

    invoke-static/range {v4 .. v10}, Lep1/q;->b(Ljava/util/Calendar;Ljava/text/SimpleDateFormat;Lp1/c1;Landroid/widget/DatePicker;III)V

    return-void

    :pswitch_1
    move-object v7, p1

    move v8, p2

    move v9, p3

    move v10, p4

    iget-object p1, p0, Ld42/e;->c:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ljava/text/SimpleDateFormat;

    iget-object v6, p0, Ld42/e;->d:Lp1/c1;

    iget-object v4, p0, Ld42/e;->b:Ljava/util/Calendar;

    invoke-static/range {v4 .. v10}, Ld42/j;->a(Ljava/util/Calendar;Ljava/text/SimpleDateFormat;Lp1/c1;Landroid/widget/DatePicker;III)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

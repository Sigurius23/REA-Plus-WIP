.class public final synthetic Lbm2/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/DatePickerDialog$OnDateSetListener;


# instance fields
.field public final synthetic a:Ljava/util/Calendar;

.field public final synthetic b:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Calendar;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbm2/u;->a:Ljava/util/Calendar;

    iput-object p2, p0, Lbm2/u;->b:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final onDateSet(Landroid/widget/DatePicker;III)V
    .locals 6

    iget-object v0, p0, Lbm2/u;->a:Ljava/util/Calendar;

    iget-object v1, p0, Lbm2/u;->b:Lp1/c1;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-static/range {v0 .. v5}, Lbm2/e0;->d(Ljava/util/Calendar;Lp1/c1;Landroid/widget/DatePicker;III)V

    return-void
.end method

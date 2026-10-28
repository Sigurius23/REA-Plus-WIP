.class public final synthetic Ljp1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CalendarView$OnDateChangeListener;


# instance fields
.field public final synthetic a:Ljava/util/Calendar;

.field public final synthetic b:Lkotlin/jvm/internal/g0;

.field public final synthetic c:Ljava/text/SimpleDateFormat;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Calendar;Lkotlin/jvm/internal/g0;Ljava/text/SimpleDateFormat;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljp1/e;->a:Ljava/util/Calendar;

    iput-object p2, p0, Ljp1/e;->b:Lkotlin/jvm/internal/g0;

    iput-object p3, p0, Ljp1/e;->c:Ljava/text/SimpleDateFormat;

    return-void
.end method


# virtual methods
.method public final onSelectedDayChange(Landroid/widget/CalendarView;III)V
    .locals 7

    iget-object v1, p0, Ljp1/e;->b:Lkotlin/jvm/internal/g0;

    iget-object v2, p0, Ljp1/e;->c:Ljava/text/SimpleDateFormat;

    iget-object v0, p0, Ljp1/e;->a:Ljava/util/Calendar;

    move-object v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    invoke-static/range {v0 .. v6}, Ljp1/f;->e(Ljava/util/Calendar;Lkotlin/jvm/internal/g0;Ljava/text/SimpleDateFormat;Landroid/widget/CalendarView;III)V

    return-void
.end method

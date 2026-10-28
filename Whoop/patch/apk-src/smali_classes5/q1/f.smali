.class public final Lq1/f;
.super Lq1/j0;
.source "SourceFile"


# static fields
.field public static final d:Lq1/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lq1/f;

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lq1/j0;-><init>(III)V

    sput-object v0, Lq1/f;->d:Lq1/f;

    return-void
.end method


# virtual methods
.method public final d(Lb83/i;Lp1/c;Lp1/i2;Lx1/h;Lq1/k0;)V
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lb83/i;->c(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx1/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget v0, v0, Lx1/d;->a:I

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-virtual {p1, v1}, Lb83/i;->c(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq1/a;

    if-lez v0, :cond_1

    new-instance v1, Lcom/google/android/material/datepicker/n;

    invoke-direct {v1, p2, v0}, Lcom/google/android/material/datepicker/n;-><init>(Lp1/c;I)V

    move-object p2, v1

    :cond_1
    if-eqz p5, :cond_2

    new-instance v0, Ld1/j;

    const/16 v1, 0x1a

    invoke-direct {v0, v1, p5, p3}, Ld1/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p1, p2, p3, p4, v0}, Lq1/a;->c0(Lp1/c;Lp1/i2;Lx1/h;Lq1/k0;)V

    return-void
.end method

.class public final Lq1/h;
.super Lq1/j0;
.source "SourceFile"


# static fields
.field public static final d:Lq1/h;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lq1/h;

    const/4 v1, 0x4

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lq1/j0;-><init>(III)V

    sput-object v0, Lq1/h;->d:Lq1/h;

    return-void
.end method


# virtual methods
.method public final d(Lb83/i;Lp1/c;Lp1/i2;Lx1/h;Lq1/k0;)V
    .locals 0

    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Lb83/i;->c(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lp1/y0;

    const/4 p3, 0x3

    invoke-virtual {p1, p3}, Lb83/i;->c(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lp1/y0;

    const/4 p3, 0x1

    invoke-virtual {p1, p3}, Lb83/i;->c(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lp1/t;

    const/4 p4, 0x0

    invoke-virtual {p1, p4}, Lb83/i;->c(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp1/x0;

    invoke-virtual {p3, p2}, Lp1/t;->l(Lp1/y0;)Lp1/x0;

    const-string p1, "Could not resolve state for movable content"

    invoke-static {p1}, Lp1/r;->d(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

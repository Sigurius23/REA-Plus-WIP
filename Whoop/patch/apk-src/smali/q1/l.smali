.class public final Lq1/l;
.super Lq1/j0;
.source "SourceFile"


# static fields
.field public static final d:Lq1/l;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lq1/l;

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lq1/j0;-><init>(III)V

    sput-object v0, Lq1/l;->d:Lq1/l;

    return-void
.end method


# virtual methods
.method public final d(Lb83/i;Lp1/c;Lp1/i2;Lx1/h;Lq1/k0;)V
    .locals 0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lb83/i;->c(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lkotlin/jvm/functions/Function1;

    const/4 p3, 0x1

    invoke-virtual {p1, p3}, Lb83/i;->c(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp1/s;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.class public final Lq1/p;
.super Lq1/j0;
.source "SourceFile"


# static fields
.field public static final d:Lq1/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lq1/p;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lq1/j0;-><init>(III)V

    sput-object v0, Lq1/p;->d:Lq1/p;

    return-void
.end method


# virtual methods
.method public final d(Lb83/i;Lp1/c;Lp1/i2;Lx1/h;Lq1/k0;)V
    .locals 0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lb83/i;->c(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp1/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3, p1}, Lp1/i2;->c(Lp1/a;)I

    move-result p1

    invoke-virtual {p3, p1}, Lp1/i2;->l(I)V

    return-void
.end method

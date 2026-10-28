.class public abstract Lf1/c1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lep0/a;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lep0/a;-><init>(I)V

    new-instance v1, Lp1/b0;

    invoke-direct {v1, v0}, Lp1/b0;-><init>(Lc93/a;)V

    sput-object v1, Lf1/c1;->a:Lp1/b0;

    return-void
.end method

.method public static final a(Lf1/a1;J)Z
    .locals 0

    if-eqz p0, :cond_0

    check-cast p0, Lf1/b1;

    invoke-virtual {p0}, Lf1/b1;->a()La0/k0;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1, p2}, La0/k0;->b(J)Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.class public final Lf0/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li2/a1;


# static fields
.field public static final a:Lf0/m0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf0/m0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lf0/m0;->a:Lf0/m0;

    return-void
.end method


# virtual methods
.method public final a(JLy3/m;Ly3/c;)Li2/p0;
    .locals 5

    sget p3, Lf0/y;->a:F

    invoke-interface {p4, p3}, Ly3/c;->F(F)I

    move-result p3

    int-to-float p3, p3

    new-instance p4, Li2/n0;

    new-instance v0, Lh2/c;

    neg-float v1, p3

    const/16 v2, 0x20

    shr-long v2, p1, v2

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    const-wide v3, 0xffffffffL

    and-long/2addr p1, v3

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    add-float/2addr p1, p3

    const/4 p2, 0x0

    invoke-direct {v0, p2, v1, v2, p1}, Lh2/c;-><init>(FFFF)V

    invoke-direct {p4, v0}, Li2/n0;-><init>(Lh2/c;)V

    return-object p4
.end method

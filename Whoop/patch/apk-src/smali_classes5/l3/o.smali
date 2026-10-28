.class public final Ll3/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li2/a1;


# static fields
.field public static final a:Ll3/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ll3/o;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll3/o;->a:Ll3/o;

    return-void
.end method


# virtual methods
.method public final a(JLy3/m;Ly3/c;)Li2/p0;
    .locals 11

    invoke-static {p1, p2}, Lh2/e;->d(J)F

    move-result p3

    const/high16 p4, 0x40000000    # 2.0f

    div-float/2addr p3, p4

    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p4

    int-to-long v0, p4

    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p3

    int-to-long p3, p3

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    const-wide v2, 0xffffffffL

    and-long/2addr p3, v2

    or-long v3, v0, p3

    new-instance p3, Li2/o0;

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, p1, p2}, Lhg3/i;->j(JJ)Lh2/c;

    move-result-object v2

    move-wide v5, v3

    move-wide v7, v3

    move-wide v9, v3

    invoke-static/range {v2 .. v10}, Lj93/l0;->c(Lh2/c;JJJJ)Lh2/d;

    move-result-object p1

    invoke-direct {p3, p1}, Li2/o0;-><init>(Lh2/d;)V

    return-object p3
.end method

.class public final Lec3/z1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lec3/b2;

.field public static final b:Lec3/b2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lec3/b2;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lec3/b2;-><init>(I)V

    sput-object v0, Lec3/z1;->a:Lec3/b2;

    new-instance v0, Lec3/b2;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lec3/b2;-><init>(I)V

    sput-object v0, Lec3/z1;->b:Lec3/b2;

    return-void
.end method

.method public static a(IJ)Lec3/e2;
    .locals 3

    and-int/lit8 v0, p0, 0x1

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    move-wide p1, v1

    :cond_0
    and-int/lit8 p0, p0, 0x2

    if-eqz p0, :cond_1

    const-wide v1, 0x7fffffffffffffffL

    :cond_1
    new-instance p0, Lec3/e2;

    invoke-direct {p0, p1, p2, v1, v2}, Lec3/e2;-><init>(JJ)V

    return-object p0
.end method

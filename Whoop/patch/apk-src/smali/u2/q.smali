.class public abstract Lu2/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lu2/a;

.field public static final b:Lu2/a;

.field public static final c:Lu2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lu2/a;

    const/16 v1, 0x3e8

    invoke-direct {v0, v1}, Lu2/a;-><init>(I)V

    sput-object v0, Lu2/q;->a:Lu2/a;

    new-instance v0, Lu2/a;

    const/16 v1, 0x3ef

    invoke-direct {v0, v1}, Lu2/a;-><init>(I)V

    new-instance v0, Lu2/a;

    const/16 v1, 0x3f0

    invoke-direct {v0, v1}, Lu2/a;-><init>(I)V

    sput-object v0, Lu2/q;->b:Lu2/a;

    new-instance v0, Lu2/a;

    const/16 v1, 0x3ea

    invoke-direct {v0, v1}, Lu2/a;-><init>(I)V

    sput-object v0, Lu2/q;->c:Lu2/a;

    return-void
.end method

.method public static final a(JJ)Z
    .locals 0

    cmp-long p0, p0, p2

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static b(J)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PointerId(value="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

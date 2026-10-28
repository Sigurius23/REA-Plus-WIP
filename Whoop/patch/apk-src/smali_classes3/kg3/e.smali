.class public final Lkg3/e;
.super Lkg3/d;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final w:Lkg3/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkg3/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lkg3/e;->w:Lkg3/e;

    return-void
.end method

.method public static isLeapYear(J)Z
    .locals 4

    const-wide/16 v0, 0x3

    and-long/2addr v0, p0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    const-wide/16 v0, 0x64

    rem-long v0, p0, v0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const-wide/16 v0, 0x190

    rem-long/2addr p0, v0

    cmp-long p0, p0, v2

    if-nez p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lkg3/e;->w:Lkg3/e;

    return-object v0
.end method

.class public abstract Lee3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lio/sentry/hints/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/sentry/hints/j;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lio/sentry/hints/j;-><init>(I)V

    sput-object v0, Lee3/a;->a:Lio/sentry/hints/j;

    return-void
.end method

.method public static final a(ILjava/lang/String;)I
    .locals 1

    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    add-int/lit8 p0, p0, 0x1

    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    shl-int/lit8 p1, v0, 0x7

    add-int/2addr p1, p0

    return p1
.end method

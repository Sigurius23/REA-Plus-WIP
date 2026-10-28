.class public final Lf0/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf0/v0;


# static fields
.field public static final a:Lf0/e0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf0/e0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lf0/e0;->a:Lf0/e0;

    return-void
.end method


# virtual methods
.method public final a(Lj0/i;)La3/n;
    .locals 1

    new-instance v0, Lf0/d0;

    invoke-direct {v0, p1}, Lf0/d0;-><init>(Lj0/i;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.class public final Lzu/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lzu/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lzu/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lzu/a;->a:Lzu/a;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    instance-of p1, p1, Lzu/a;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    const v0, 0x67ab18e

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "LineJoin(value=round)"

    return-object v0
.end method

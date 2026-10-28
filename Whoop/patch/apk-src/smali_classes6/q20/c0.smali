.class public final Lq20/c0;
.super Lq20/e0;
.source "SourceFile"


# static fields
.field public static final b:Lq20/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq20/c0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lq20/e0;-><init>(Lq20/d0;)V

    sput-object v0, Lq20/c0;->b:Lq20/c0;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lq20/c0;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public final hashCode()I
    .locals 1

    const v0, -0x6a86f2cd

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "StartProcessing"

    return-object v0
.end method

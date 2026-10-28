.class public final Luz/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luz/e;


# static fields
.field public static final a:Luz/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Luz/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Luz/c;->a:Luz/c;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    invoke-static {p0}, Ls4/i;->g(Luz/e;)Z

    move-result v0

    return v0
.end method

.method public final b()Z
    .locals 1

    invoke-static {p0}, Ls4/i;->k(Luz/e;)Z

    move-result v0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Luz/c;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public final hashCode()I
    .locals 1

    const v0, 0x5db7ef0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Loading"

    return-object v0
.end method

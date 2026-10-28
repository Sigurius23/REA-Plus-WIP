.class public final Lc43/s;
.super Ltx/f;
.source "SourceFile"


# static fields
.field public static final a:Lc43/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc43/s;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lc43/s;->a:Lc43/s;

    return-void
.end method


# virtual methods
.method public final M()Ljava/lang/String;
    .locals 1

    const-string v0, "decline"

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lc43/s;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public final hashCode()I
    .locals 1

    const v0, -0x24117433

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Decline"

    return-object v0
.end method

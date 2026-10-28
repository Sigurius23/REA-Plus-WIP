.class public final Lk53/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[J


# direct methods
.method public constructor <init>()V
    .locals 6

    const/4 v0, 0x4

    new-array v0, v0, [J

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    aput-wide v1, v0, v3

    const/4 v1, 0x1

    const-wide/16 v2, 0x3e8

    aput-wide v2, v0, v1

    const-wide/16 v4, 0x1f4

    const/4 v1, 0x2

    aput-wide v4, v0, v1

    const/4 v1, 0x3

    aput-wide v2, v0, v1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lk53/b;->a:[J

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_2

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const-class v1, Lk53/b;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    const-string v0, "null cannot be cast to non-null type io.getstream.video.android.core.sounds.RingingCallVibrationConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lk53/b;

    iget-object v0, p0, Lk53/b;->a:[J

    iget-object p1, p1, Lk53/b;->a:[J

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([J[J)Z

    move-result p1

    if-nez p1, :cond_3

    :goto_1
    const/4 p1, 0x0

    return p1

    :cond_3
    :goto_2
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 2

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lk53/b;->a:[J

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lk53/b;->a:[J

    invoke-static {v0}, Ljava/util/Arrays;->toString([J)Ljava/lang/String;

    move-result-object v0

    const-string v1, "RingingCallVibrationConfig(vibratePattern="

    const-string v2, ", enabled=false)"

    invoke-static {v1, v0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

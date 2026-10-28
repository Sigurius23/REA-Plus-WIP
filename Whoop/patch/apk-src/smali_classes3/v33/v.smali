.class public final Lv33/v;
.super Lv33/w;
.source "SourceFile"


# instance fields
.field public final a:Lv33/o;


# direct methods
.method public constructor <init>(Lv33/o;)V
    .locals 0

    invoke-direct {p0}, Lio/getstream/android/video/generated/models/VideoEvent;-><init>()V

    iput-object p1, p0, Lv33/v;->a:Lv33/o;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lv33/v;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lv33/v;

    iget-object v1, p0, Lv33/v;->a:Lv33/o;

    iget-object p1, p1, Lv33/v;->a:Lv33/o;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lv33/v;->a:Lv33/o;

    invoke-virtual {v0}, Lv33/o;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SFUHealthCheckEvent(participantCount="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lv33/v;->a:Lv33/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

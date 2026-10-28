.class public final Lv33/d;
.super Lv33/w;
.source "SourceFile"


# instance fields
.field public final a:Lstream/video/sfu/event/ChangePublishOptions;


# direct methods
.method public constructor <init>(Lstream/video/sfu/event/ChangePublishOptions;)V
    .locals 1

    const-string v0, "change"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/android/video/generated/models/VideoEvent;-><init>()V

    iput-object p1, p0, Lv33/d;->a:Lstream/video/sfu/event/ChangePublishOptions;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lv33/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lv33/d;

    iget-object v1, p0, Lv33/d;->a:Lstream/video/sfu/event/ChangePublishOptions;

    iget-object p1, p1, Lv33/d;->a:Lstream/video/sfu/event/ChangePublishOptions;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lv33/d;->a:Lstream/video/sfu/event/ChangePublishOptions;

    invoke-virtual {v0}, Lstream/video/sfu/event/ChangePublishOptions;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ChangePublishOptionsEvent(change="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lv33/d;->a:Lstream/video/sfu/event/ChangePublishOptions;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

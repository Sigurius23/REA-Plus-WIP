.class public abstract Lv33/w;
.super Lio/getstream/android/video/generated/models/VideoEvent;
.source "SourceFile"


# virtual methods
.method public getEventType()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "UnknownEvent"

    :cond_0
    return-object v0
.end method

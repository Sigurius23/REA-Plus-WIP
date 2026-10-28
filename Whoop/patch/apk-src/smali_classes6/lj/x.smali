.class public final Llj/x;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public final serializer()Lwc3/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {}, Lcom/amplitude/android/engagement/types/PinPointerType;->access$get$cachedSerializer$delegate$cp()Ll83/h;

    move-result-object v0

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    return-object v0
.end method

.class public final synthetic Lpj/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/amplitude/quickjs/wrapper/JSCallFunction;


# virtual methods
.method public final call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "PinView error: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/internal/l0;->K([Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

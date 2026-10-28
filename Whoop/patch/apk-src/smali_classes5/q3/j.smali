.class public final Lq3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq3/h;


# virtual methods
.method public final a(Ldn/e;)V
    .locals 1

    const/4 v0, -0x1

    iput v0, p1, Ldn/e;->z:I

    iput v0, p1, Ldn/e;->E:I

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    instance-of p1, p1, Lq3/j;

    return p1
.end method

.method public final hashCode()I
    .locals 2

    const-class v0, Lq3/j;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "FinishComposingTextCommand()"

    return-object v0
.end method

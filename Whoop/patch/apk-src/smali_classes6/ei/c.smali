.class public final Lei/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lki/c;


# virtual methods
.method public final a()Luh/e;
    .locals 3

    new-instance v0, Lbi/j;

    new-instance v1, Ldf2/a;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Ldf2/a;-><init>(I)V

    invoke-direct {v0, v1}, Lbi/j;-><init>(Ldf2/a;)V

    return-object v0
.end method

.method public final b()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final type()Lj93/d;
    .locals 2

    const-class v0, Lrh/y;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    return-object v0
.end method

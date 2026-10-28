.class public final Lmi/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lki/c;


# virtual methods
.method public final a()Luh/e;
    .locals 2

    new-instance v0, Lli/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lli/b;-><init>(I)V

    return-object v0
.end method

.method public final type()Lj93/d;
    .locals 2

    const-class v0, Landroid/media/MediaDataSource;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    return-object v0
.end method

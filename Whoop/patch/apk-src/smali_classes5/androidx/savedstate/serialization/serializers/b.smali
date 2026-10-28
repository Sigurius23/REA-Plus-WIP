.class public final Landroidx/savedstate/serialization/serializers/b;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public final serializer(Lwc3/c;)Lwc3/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lwc3/c;",
            ")",
            "Lwc3/c;"
        }
    .end annotation

    const-string v0, "typeSerial0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate$$serializer;

    invoke-direct {v0, p1}, Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate$$serializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

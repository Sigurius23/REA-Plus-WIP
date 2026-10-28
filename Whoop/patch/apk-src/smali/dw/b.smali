.class public final Ldw/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ldw/e;

.field public b:Ljava/lang/String;


# virtual methods
.method public final a()Ldw/c;
    .locals 5

    iget-object v0, p0, Ldw/b;->a:Ldw/e;

    if-eqz v0, :cond_1

    iget-object v1, p0, Ldw/b;->b:Ljava/lang/String;

    if-eqz v1, :cond_0

    new-instance v2, Le10/k0;

    const/16 v3, 0x9

    invoke-direct {v2, v3}, Le10/k0;-><init>(I)V

    new-instance v3, Lz7/a;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Lz7/a;-><init>(I)V

    new-instance v4, Ldw/c;

    invoke-direct {v4, v0, v1, v2, v3}, Ldw/c;-><init>(Ldw/e;Ljava/lang/String;Le10/k0;Lz7/a;)V

    return-object v4

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Device serial number must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Memfault API must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

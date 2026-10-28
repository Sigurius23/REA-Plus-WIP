.class public final Lli/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsh/j;


# virtual methods
.method public final a(Luh/h;Lfi/o;)Lsh/k;
    .locals 3

    iget-object v0, p1, Luh/h;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v1, "video/"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lli/g;

    iget-object p1, p1, Luh/h;->a:Lsh/q;

    invoke-direct {v0, p1, p2}, Lli/g;-><init>(Lsh/q;Lfi/o;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

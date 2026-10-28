.class public final Lwh/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lki/b;


# virtual methods
.method public final a()Lsh/j;
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    new-instance v1, Lvh/a;

    const/16 v2, 0x22

    if-ge v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {v1, v0}, Lvh/a;-><init>(Z)V

    return-object v1
.end method

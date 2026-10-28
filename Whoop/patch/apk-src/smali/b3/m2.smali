.class public abstract Lb3/m2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb3/j2;


# instance fields
.field public w:Lb3/l2;


# virtual methods
.method public final getInspectableElements()Lxb3/i;
    .locals 1

    iget-object v0, p0, Lb3/m2;->w:Lb3/l2;

    if-nez v0, :cond_0

    new-instance v0, Lb3/l2;

    invoke-direct {v0}, Lb3/l2;-><init>()V

    :cond_0
    iput-object v0, p0, Lb3/m2;->w:Lb3/l2;

    invoke-virtual {v0}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    return-object v0
.end method

.method public final getNameFallback()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lb3/m2;->w:Lb3/l2;

    if-nez v0, :cond_0

    new-instance v0, Lb3/l2;

    invoke-direct {v0}, Lb3/l2;-><init>()V

    :cond_0
    iput-object v0, p0, Lb3/m2;->w:Lb3/l2;

    invoke-virtual {v0}, Lb3/l2;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

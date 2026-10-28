.class public final Ll83/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq83/d;


# instance fields
.field public w:Lbd3/a0;

.field public x:Lq83/d;

.field public y:Ljava/lang/Object;


# virtual methods
.method public final a(Lbd3/b0;)V
    .locals 0

    iput-object p1, p0, Ll83/b;->x:Lq83/d;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-void
.end method

.method public final getContext()Lq83/j;
    .locals 1

    sget-object v0, Lq83/k;->w:Lq83/k;

    return-object v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Ll83/b;->x:Lq83/d;

    iput-object p1, p0, Ll83/b;->y:Ljava/lang/Object;

    return-void
.end method

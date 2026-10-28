.class public final La6/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq83/h;


# instance fields
.field public final w:La6/k1;

.field public final x:La6/i0;


# direct methods
.method public constructor <init>(La6/k1;La6/i0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La6/k1;->w:La6/k1;

    iput-object p2, p0, La6/k1;->x:La6/i0;

    return-void
.end method


# virtual methods
.method public final a(La6/i0;)V
    .locals 1

    iget-object v0, p0, La6/k1;->x:La6/i0;

    if-eq v0, p1, :cond_1

    iget-object v0, p0, La6/k1;->w:La6/k1;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, La6/k1;->a(La6/i0;)V

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p2, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge get(Lq83/i;)Lq83/h;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->D(Lq83/h;Lq83/i;)Lq83/h;

    move-result-object p1

    return-object p1
.end method

.method public final getKey()Lq83/i;
    .locals 1

    sget-object v0, La6/j1;->w:La6/j1;

    return-object v0
.end method

.method public final bridge minusKey(Lq83/i;)Lq83/j;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->Q(Lq83/h;Lq83/i;)Lq83/j;

    move-result-object p1

    return-object p1
.end method

.method public final bridge plus(Lq83/j;)Lq83/j;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object p1

    return-object p1
.end method

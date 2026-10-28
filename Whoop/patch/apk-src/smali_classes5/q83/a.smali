.class public abstract Lq83/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq83/h;


# instance fields
.field private final key:Lq83/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq83/i;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lq83/i;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq83/a;->key:Lq83/i;

    return-void
.end method


# virtual methods
.method public bridge fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lc93/m;",
            ")TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Le93/b;->B(Lq83/h;Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge get(Lq83/i;)Lq83/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lq83/h;",
            ">(",
            "Lq83/i;",
            ")TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Le93/b;->D(Lq83/h;Lq83/i;)Lq83/h;

    move-result-object p1

    return-object p1
.end method

.method public getKey()Lq83/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lq83/i;"
        }
    .end annotation

    iget-object v0, p0, Lq83/a;->key:Lq83/i;

    return-object v0
.end method

.method public bridge minusKey(Lq83/i;)Lq83/j;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/i;",
            ")",
            "Lq83/j;"
        }
    .end annotation

    invoke-static {p0, p1}, Le93/b;->Q(Lq83/h;Lq83/i;)Lq83/j;

    move-result-object p1

    return-object p1
.end method

.method public bridge plus(Lq83/j;)Lq83/j;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object p1

    return-object p1
.end method

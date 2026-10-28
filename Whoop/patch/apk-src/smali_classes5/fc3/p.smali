.class public final Lfc3/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq83/j;


# instance fields
.field public final synthetic w:Lq83/j;

.field public final x:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Lq83/j;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfc3/p;->w:Lq83/j;

    iput-object p2, p0, Lfc3/p;->x:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lfc3/p;->w:Lq83/j;

    invoke-interface {v0, p1, p2}, Lq83/j;->fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final get(Lq83/i;)Lq83/h;
    .locals 1

    iget-object v0, p0, Lfc3/p;->w:Lq83/j;

    invoke-interface {v0, p1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p1

    return-object p1
.end method

.method public final minusKey(Lq83/i;)Lq83/j;
    .locals 1

    iget-object v0, p0, Lfc3/p;->w:Lq83/j;

    invoke-interface {v0, p1}, Lq83/j;->minusKey(Lq83/i;)Lq83/j;

    move-result-object p1

    return-object p1
.end method

.method public final plus(Lq83/j;)Lq83/j;
    .locals 1

    iget-object v0, p0, Lfc3/p;->w:Lq83/j;

    invoke-interface {v0, p1}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p1

    return-object p1
.end method

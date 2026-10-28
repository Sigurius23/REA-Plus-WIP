.class public final Llb/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq83/h;


# instance fields
.field public final w:Lq83/i;

.field public final x:Llb/a0;


# direct methods
.method public constructor <init>(Lq83/i;Llb/a0;)V
    .locals 1

    const-string v0, "connectionWrapper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb/a;->w:Lq83/i;

    iput-object p2, p0, Llb/a;->x:Llb/a0;

    return-void
.end method


# virtual methods
.method public final fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p2, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final get(Lq83/i;)Lq83/h;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->D(Lq83/h;Lq83/i;)Lq83/h;

    move-result-object p1

    return-object p1
.end method

.method public final getKey()Lq83/i;
    .locals 1

    iget-object v0, p0, Llb/a;->w:Lq83/i;

    return-object v0
.end method

.method public final minusKey(Lq83/i;)Lq83/j;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->Q(Lq83/h;Lq83/i;)Lq83/j;

    move-result-object p1

    return-object p1
.end method

.method public final plus(Lq83/j;)Lq83/j;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object p1

    return-object p1
.end method

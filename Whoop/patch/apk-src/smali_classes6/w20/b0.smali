.class public final Lw20/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lec3/f2;

.field public final b:Lec3/h2;

.field public final c:Lec3/r1;

.field public final d:Ln53/e;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ly00/i;ZLec3/r1;Ln8/a;)V
    .locals 3

    const-string v0, "lastFour"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardBrand"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "processing"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lw20/b0;->a:Lec3/f2;

    new-instance v0, Lw20/y;

    new-instance v1, Lw20/z;

    const-string v2, ""

    invoke-direct {v1, v2, p2}, Lw20/z;-><init>(Ljava/lang/String;Ly00/i;)V

    iget-object p2, p4, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    invoke-direct {v0, p1, p3, v1, p2}, Lw20/y;-><init>(Ljava/lang/String;ZLw20/z;Z)V

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lw20/b0;->b:Lec3/h2;

    invoke-static {p1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p2

    iput-object p2, p0, Lw20/b0;->c:Lec3/r1;

    new-instance p2, Lsz/q;

    const/16 p3, 0xb

    const/4 p4, 0x0

    invoke-direct {p2, p0, p4, p3}, Lsz/q;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 p3, 0x3

    invoke-static {p5, p4, p4, p2, p3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance p2, Lw01/e;

    const/4 p3, 0x7

    invoke-direct {p2, p3}, Lw01/e;-><init>(I)V

    invoke-static {p1, p2}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p1

    iput-object p1, p0, Lw20/b0;->d:Ln53/e;

    return-void
.end method

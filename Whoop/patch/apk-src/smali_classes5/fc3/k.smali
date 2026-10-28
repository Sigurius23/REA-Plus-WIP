.class public final Lfc3/k;
.super Lfc3/g;
.source "SourceFile"


# instance fields
.field public final E:Ls83/i;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function3;Lec3/l;Lq83/j;ILdc3/a;)V
    .locals 0

    invoke-direct {p0, p4, p5, p2, p3}, Lfc3/g;-><init>(ILdc3/a;Lec3/l;Lq83/j;)V

    check-cast p1, Ls83/i;

    iput-object p1, p0, Lfc3/k;->E:Ls83/i;

    return-void
.end method


# virtual methods
.method public final f(Lq83/j;ILdc3/a;)Lfc3/d;
    .locals 6

    new-instance v0, Lfc3/k;

    iget-object v1, p0, Lfc3/k;->E:Ls83/i;

    iget-object v2, p0, Lfc3/g;->z:Lec3/l;

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lfc3/k;-><init>(Lkotlin/jvm/functions/Function3;Lec3/l;Lq83/j;ILdc3/a;)V

    return-object v0
.end method

.method public final i(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lfc3/i;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lfc3/i;-><init>(Lfc3/k;Lec3/m;Lq83/d;)V

    invoke-static {v0, p2}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

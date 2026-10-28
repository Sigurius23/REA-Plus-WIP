.class final Lbp0/s$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbp0/s$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic E:Lzo0/c;

.field final synthetic w:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic x:Lbp0/c;

.field final synthetic y:Ldp0/g;

.field final synthetic z:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Lbp0/c;Ldp0/g;Lp1/c1;Lzo0/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Lbp0/c;",
            "Ldp0/g;",
            "Lp1/c1;",
            "Lzo0/c;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lbp0/s$b$a;->w:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Lbp0/s$b$a;->x:Lbp0/c;

    iput-object p3, p0, Lbp0/s$b$a;->y:Ldp0/g;

    iput-object p4, p0, Lbp0/s$b$a;->z:Lp1/c1;

    iput-object p5, p0, Lbp0/s$b$a;->E:Lzo0/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lcp0/l;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcp0/l;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lbp0/s$b$a;->w:Lkotlin/jvm/internal/g0;

    iget-object p2, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p2, Lcp0/l;

    iget-object v0, p0, Lbp0/s$b$a;->x:Lbp0/c;

    iget-object v1, p0, Lbp0/s$b$a;->y:Ldp0/g;

    invoke-interface {v1}, Ldp0/g;->getState()Lec3/f2;

    move-result-object v1

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lep0/d;

    invoke-virtual {v1}, Lep0/d;->b()Lep0/j;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lep0/j;->s()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    move-object v2, v1

    :cond_0
    if-nez v2, :cond_1

    const-string v2, ""

    :cond_1
    invoke-virtual {v0, p1, v2}, Lbp0/c;->a(Lcp0/l;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lbp0/s$b$a;->z:Lp1/c1;

    invoke-static {v1}, Lbp0/s;->Y0(Lp1/c1;)Z

    move-result v1

    invoke-static {p2, p1, v0, v1}, Lbp0/s;->k1(Lcp0/l;Lcp0/l;Ljava/lang/String;Z)Ldp0/e;

    move-result-object p2

    if-eqz p2, :cond_2

    iget-object v0, p0, Lbp0/s$b$a;->E:Lzo0/c;

    if-eqz v0, :cond_2

    invoke-interface {v0, p2}, Lzo0/c;->n(Ldp0/e;)V

    :cond_2
    iget-object p2, p0, Lbp0/s$b$a;->w:Lkotlin/jvm/internal/g0;

    iput-object p1, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcp0/l;

    invoke-virtual {p0, p1, p2}, Lbp0/s$b$a;->b(Lcp0/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

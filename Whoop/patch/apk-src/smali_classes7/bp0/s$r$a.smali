.class final Lbp0/s$r$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbp0/s$r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic E:Ldp0/g;

.field final synthetic w:Z

.field final synthetic x:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic y:Lzo0/c;

.field final synthetic z:Lcp0/t;


# direct methods
.method public constructor <init>(ZLkotlin/jvm/internal/g0;Lzo0/c;Lcp0/t;Ldp0/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/internal/g0;",
            "Lzo0/c;",
            "Lcp0/t;",
            "Ldp0/g;",
            ")V"
        }
    .end annotation

    iput-boolean p1, p0, Lbp0/s$r$a;->w:Z

    iput-object p2, p0, Lbp0/s$r$a;->x:Lkotlin/jvm/internal/g0;

    iput-object p3, p0, Lbp0/s$r$a;->y:Lzo0/c;

    iput-object p4, p0, Lbp0/s$r$a;->z:Lcp0/t;

    iput-object p5, p0, Lbp0/s$r$a;->E:Ldp0/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lcp0/l;Lq83/d;)Ljava/lang/Object;
    .locals 0
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

    sget-object p2, Lcp0/l;->Bar:Lcp0/l;

    if-ne p1, p2, :cond_2

    iget-boolean p2, p0, Lbp0/s$r$a;->w:Z

    if-nez p2, :cond_2

    iget-object p2, p0, Lbp0/s$r$a;->x:Lkotlin/jvm/internal/g0;

    iget-object p2, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p2, Lcp0/l;

    invoke-static {p2, p1}, Lbp0/s;->m1(Lcp0/l;Lcp0/l;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lbp0/s$r$a;->y:Lzo0/c;

    if-eqz p2, :cond_0

    invoke-interface {p2}, Lzo0/c;->j()V

    :cond_0
    iget-object p2, p0, Lbp0/s$r$a;->z:Lcp0/t;

    invoke-virtual {p2}, Lcp0/t;->o()V

    :cond_1
    iget-object p2, p0, Lbp0/s$r$a;->E:Ldp0/g;

    invoke-interface {p2}, Ldp0/g;->m()V

    :cond_2
    iget-object p2, p0, Lbp0/s$r$a;->x:Lkotlin/jvm/internal/g0;

    iput-object p1, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcp0/l;

    invoke-virtual {p0, p1, p2}, Lbp0/s$r$a;->b(Lcp0/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

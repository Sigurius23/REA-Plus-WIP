.class final Lbs1/c0$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbs1/c0$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic E:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic w:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field final synthetic x:Lds1/k;

.field final synthetic y:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic z:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc93/m;Lds1/k;Lp1/c1;Lkotlin/jvm/internal/g0;Lc93/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/m;",
            "Lds1/k;",
            "Lp1/c1;",
            "Lkotlin/jvm/internal/g0;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lbs1/c0$h$a;->w:Lc93/m;

    iput-object p2, p0, Lbs1/c0$h$a;->x:Lds1/k;

    iput-object p3, p0, Lbs1/c0$h$a;->y:Lp1/c1;

    iput-object p4, p0, Lbs1/c0$h$a;->z:Lkotlin/jvm/internal/g0;

    iput-object p5, p0, Lbs1/c0$h$a;->E:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lg1/z3;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg1/z3;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lbs1/c0$h$a;->w:Lc93/m;

    sget-object v0, Lg1/z3;->w:Lg1/z3;

    if-eq p1, v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-object v2, p0, Lbs1/c0$h$a;->x:Lds1/k;

    invoke-virtual {v2}, Lds1/k;->f()Lds1/e;

    move-result-object v2

    invoke-virtual {v2}, Lds1/e;->r()Lds1/b;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lds1/b;->c()Lds1/a;

    move-result-object v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    invoke-interface {p2, v1, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-ne p1, v0, :cond_2

    iget-object p2, p0, Lbs1/c0$h$a;->y:Lp1/c1;

    invoke-interface {p2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_2

    iget-object p2, p0, Lbs1/c0$h$a;->y:Lp1/c1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p2, v1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    iget-object p2, p0, Lbs1/c0$h$a;->z:Lkotlin/jvm/internal/g0;

    iget-object p2, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz p2, :cond_2

    if-eq p2, v0, :cond_2

    iget-object p2, p0, Lbs1/c0$h$a;->E:Lc93/a;

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_2
    iget-object p2, p0, Lbs1/c0$h$a;->z:Lkotlin/jvm/internal/g0;

    iput-object p1, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lg1/z3;

    invoke-virtual {p0, p1, p2}, Lbs1/c0$h$a;->b(Lg1/z3;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

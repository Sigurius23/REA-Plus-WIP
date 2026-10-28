.class final Lsl0/u0$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsl0/u0$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic x:Lnl0/f;

.field final synthetic y:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lnl0/f;Lp1/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Lnl0/f;",
            "Lp1/c1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lsl0/u0$b$a;->w:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lsl0/u0$b$a;->x:Lnl0/f;

    iput-object p3, p0, Lsl0/u0$b$a;->y:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lg1/z3;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    sget-object p2, Lg1/z3;->x:Lg1/z3;

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Lsl0/u0$b$a;->y:Lp1/c1;

    invoke-static {p1}, Lsl0/u0;->G0(Lp1/c1;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lsl0/u0$b$a;->w:Lkotlin/jvm/functions/Function1;

    new-instance p2, Lnl0/d$f;

    iget-object v0, p0, Lsl0/u0$b$a;->x:Lnl0/f;

    invoke-virtual {v0}, Lnl0/f;->c()Lnl0/a;

    move-result-object v0

    invoke-virtual {v0}, Lnl0/a;->e()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Lnl0/d$f;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lg1/z3;

    invoke-virtual {p0, p1, p2}, Lsl0/u0$b$a;->b(Lg1/z3;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

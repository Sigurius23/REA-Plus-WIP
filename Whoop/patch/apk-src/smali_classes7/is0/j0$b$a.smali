.class final Lis0/j0$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lis0/j0$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic E:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic w:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic x:Lb3/x2;

.field final synthetic y:Lg2/i;

.field final synthetic z:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Lb3/x2;Lg2/i;Lp1/c1;Lp1/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Lb3/x2;",
            "Lg2/i;",
            "Lp1/c1;",
            "Lp1/c1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lis0/j0$b$a;->w:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Lis0/j0$b$a;->x:Lb3/x2;

    iput-object p3, p0, Lis0/j0$b$a;->y:Lg2/i;

    iput-object p4, p0, Lis0/j0$b$a;->z:Lp1/c1;

    iput-object p5, p0, Lis0/j0$b$a;->E:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lis0/b0;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lis0/b0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lis0/j0$b$a;->w:Lkotlin/jvm/internal/g0;

    iget-object p2, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object v0, Lis0/b0;->Expanded:Lis0/b0;

    if-ne p2, v0, :cond_1

    sget-object p2, Lis0/b0;->Collapsed:Lis0/b0;

    if-ne p1, p2, :cond_1

    iget-object p2, p0, Lis0/j0$b$a;->z:Lp1/c1;

    const/4 v0, 0x0

    invoke-static {p2, v0}, Lis0/j0;->x0(Lp1/c1;Z)V

    iget-object p2, p0, Lis0/j0$b$a;->E:Lp1/c1;

    invoke-static {p2, v0}, Lis0/j0;->A0(Lp1/c1;Z)V

    iget-object p2, p0, Lis0/j0$b$a;->x:Lb3/x2;

    if-eqz p2, :cond_0

    check-cast p2, Lb3/x1;

    invoke-virtual {p2}, Lb3/x1;->a()V

    :cond_0
    iget-object p2, p0, Lis0/j0$b$a;->y:Lg2/i;

    const/4 v0, 0x1

    check-cast p2, Lg2/l;

    invoke-virtual {p2, v0}, Lg2/l;->b(Z)V

    :cond_1
    iget-object p2, p0, Lis0/j0$b$a;->w:Lkotlin/jvm/internal/g0;

    iput-object p1, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lis0/b0;

    invoke-virtual {p0, p1, p2}, Lis0/j0$b$a;->b(Lis0/b0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

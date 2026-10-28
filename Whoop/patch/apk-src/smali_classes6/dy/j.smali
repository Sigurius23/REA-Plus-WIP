.class public final Ldy/j;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# static fields
.field public static final E:Ll8/d;


# instance fields
.field public final w:Ly00/c3;

.field public final x:Luz/o;

.field public final y:Lec3/w1;

.field public final z:Lec3/w1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lb0/b;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lb0/b;-><init>(I)V

    new-instance v1, Ldo0/c;

    const/16 v2, 0xb

    invoke-direct {v1, v2}, Ldo0/c;-><init>(I)V

    const-class v2, Ldy/j;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lb0/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lb0/b;->c()Ll8/d;

    move-result-object v0

    sput-object v0, Ldy/j;->E:Ll8/d;

    return-void
.end method

.method public constructor <init>(Ly00/c3;Luz/o;)V
    .locals 2

    const-string v0, "passiveCaptchaParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Ldy/j;->w:Ly00/c3;

    iput-object p2, p0, Ldy/j;->x:Luz/o;

    const/4 p1, 0x0

    const/4 p2, 0x6

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v0, v1, p1, p2}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Ldy/j;->y:Lec3/w1;

    iput-object p1, p0, Ldy/j;->z:Lec3/w1;

    return-void
.end method


# virtual methods
.method public final g(Landroidx/fragment/app/r0;Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Ldy/i;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ldy/i;

    iget v1, v0, Ldy/i;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ldy/i;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Ldy/i;

    invoke-direct {v0, p0, p2}, Ldy/i;-><init>(Ldy/j;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Ldy/i;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ldy/i;->z:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :cond_3
    iget-object p1, v0, Ldy/i;->w:Ldy/j;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Ldy/j;->w:Ly00/c3;

    iget-object v2, p2, Ly00/c3;->w:Ljava/lang/String;

    iget-object p2, p2, Ly00/c3;->x:Ljava/lang/String;

    iput-object p0, v0, Ldy/i;->w:Ldy/j;

    iput v6, v0, Ldy/i;->z:I

    iget-object v6, p0, Ldy/j;->x:Luz/o;

    invoke-virtual {v6, p1, v2, p2, v0}, Luz/o;->a(Landroidx/fragment/app/r0;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_2

    :cond_5
    move-object p1, p0

    :goto_1
    check-cast p2, Luz/t;

    instance-of v2, p2, Luz/r;

    const/4 v6, 0x0

    if-eqz v2, :cond_6

    iget-object p1, p1, Ldy/j;->y:Lec3/w1;

    new-instance v2, Ldy/d;

    check-cast p2, Luz/r;

    iget-object p2, p2, Luz/r;->a:Ljava/lang/Throwable;

    invoke-direct {v2, p2}, Ldy/d;-><init>(Ljava/lang/Throwable;)V

    iput-object v6, v0, Ldy/i;->w:Ldy/j;

    iput v5, v0, Ldy/i;->z:I

    invoke-virtual {p1, v2, v0}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_2

    :cond_6
    instance-of v2, p2, Luz/s;

    if-eqz v2, :cond_8

    iget-object p1, p1, Ldy/j;->y:Lec3/w1;

    new-instance v2, Ldy/e;

    check-cast p2, Luz/s;

    iget-object p2, p2, Luz/s;->a:Ljava/lang/String;

    invoke-direct {v2, p2}, Ldy/e;-><init>(Ljava/lang/String;)V

    iput-object v6, v0, Ldy/i;->w:Ldy/j;

    iput v4, v0, Ldy/i;->z:I

    invoke-virtual {p1, v2, v0}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_2
    return-object v1

    :cond_7
    return-object v3

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

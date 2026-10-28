.class public final Lfy/g;
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

    new-instance v1, Lfq2/c;

    const/16 v2, 0x14

    invoke-direct {v1, v2}, Lfq2/c;-><init>(I)V

    const-class v2, Lfy/g;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lb0/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lb0/b;->c()Ll8/d;

    move-result-object v0

    sput-object v0, Lfy/g;->E:Ll8/d;

    return-void
.end method

.method public constructor <init>(Ly00/c3;Luz/o;)V
    .locals 2

    const-string v0, "passiveCaptchaParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Lfy/g;->w:Ly00/c3;

    iput-object p2, p0, Lfy/g;->x:Luz/o;

    const/4 p1, 0x0

    const/4 p2, 0x6

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v0, v1, p1, p2}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lfy/g;->y:Lec3/w1;

    iput-object p1, p0, Lfy/g;->z:Lec3/w1;

    return-void
.end method


# virtual methods
.method public final g(Landroidx/fragment/app/r0;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lfy/f;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lfy/f;

    iget v1, v0, Lfy/f;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lfy/f;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lfy/f;

    invoke-direct {v0, p0, p2}, Lfy/f;-><init>(Lfy/g;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lfy/f;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lfy/f;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lfy/f;->w:Lfy/g;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lfy/g;->w:Ly00/c3;

    iget-object v2, p2, Ly00/c3;->w:Ljava/lang/String;

    iget-object p2, p2, Ly00/c3;->x:Ljava/lang/String;

    iput-object p0, v0, Lfy/f;->w:Lfy/g;

    iput v4, v0, Lfy/f;->z:I

    iget-object v4, p0, Lfy/g;->x:Luz/o;

    invoke-virtual {v4, p1, v2, p2, v0}, Luz/o;->d(Landroidx/fragment/app/r0;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object p1, p0

    :goto_1
    iget-object p1, p1, Lfy/g;->y:Lec3/w1;

    const/4 p2, 0x0

    iput-object p2, v0, Lfy/f;->w:Lfy/g;

    iput v3, v0, Lfy/f;->z:I

    sget-object p2, Lfy/d;->w:Lfy/d;

    invoke-virtual {p1, p2, v0}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

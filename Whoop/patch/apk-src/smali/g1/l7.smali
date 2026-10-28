.class public final Lg1/l7;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:F

.field public final synthetic y:Lg1/n7;


# direct methods
.method public constructor <init>(FLg1/n7;Lq83/d;)V
    .locals 0

    iput p1, p0, Lg1/l7;->x:F

    iput-object p2, p0, Lg1/l7;->y:Lg1/n7;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    new-instance v0, Lg1/l7;

    iget v1, p0, Lg1/l7;->x:F

    iget-object v2, p0, Lg1/l7;->y:Lg1/n7;

    invoke-direct {v0, v1, v2, p2}, Lg1/l7;-><init>(FLg1/n7;Lq83/d;)V

    iput-object p1, v0, Lg1/l7;->w:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh0/g1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg1/l7;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg1/l7;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg1/l7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lg1/l7;->w:Ljava/lang/Object;

    check-cast p1, Lh0/g1;

    iget-object v0, p0, Lg1/l7;->y:Lg1/n7;

    iget-object v0, v0, Lg1/n7;->g:Lp1/g1;

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v0

    iget v1, p0, Lg1/l7;->x:F

    sub-float/2addr v1, v0

    invoke-interface {p1, v1}, Lh0/g1;->a(F)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

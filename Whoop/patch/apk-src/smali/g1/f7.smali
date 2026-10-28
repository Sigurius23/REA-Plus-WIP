.class public final Lg1/f7;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public synthetic w:Lbc3/c0;

.field public synthetic x:F

.field public final synthetic y:Lg1/n7;


# direct methods
.method public constructor <init>(Lg1/n7;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lg1/f7;->y:Lg1/n7;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lbc3/c0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    check-cast p3, Lq83/d;

    new-instance v0, Lg1/f7;

    iget-object v1, p0, Lg1/f7;->y:Lg1/n7;

    invoke-direct {v0, v1, p3}, Lg1/f7;-><init>(Lg1/n7;Lq83/d;)V

    iput-object p1, v0, Lg1/f7;->w:Lbc3/c0;

    iput p2, v0, Lg1/f7;->x:F

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lg1/f7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lg1/f7;->w:Lbc3/c0;

    iget v0, p0, Lg1/f7;->x:F

    new-instance v1, Lg1/l;

    iget-object v2, p0, Lg1/f7;->y:Lg1/n7;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v1, v2, v0, v4, v3}, Lg1/l;-><init>(Ljava/lang/Object;FLq83/d;I)V

    const/4 v0, 0x3

    invoke-static {p1, v4, v4, v1, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

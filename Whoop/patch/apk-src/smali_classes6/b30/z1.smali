.class public final Lb30/z1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Lkotlin/jvm/functions/Function1;

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;FFLq83/d;)V
    .locals 1

    sget v0, Lb30/n2;->a:F

    iput-object p1, p0, Lb30/z1;->w:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lb30/z1;->x:Ljava/util/List;

    iput p3, p0, Lb30/z1;->y:F

    iput p4, p0, Lb30/z1;->z:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6

    new-instance v0, Lb30/z1;

    sget p1, Lb30/n2;->a:F

    iget-object v1, p0, Lb30/z1;->w:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lb30/z1;->x:Ljava/util/List;

    iget v3, p0, Lb30/z1;->y:F

    iget v4, p0, Lb30/z1;->z:F

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lb30/z1;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;FFLq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lb30/z1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb30/z1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb30/z1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lb30/a;

    sget v0, Lb30/n2;->a:F

    iget-object v0, p0, Lb30/z1;->x:Ljava/util/List;

    iget v1, p0, Lb30/z1;->y:F

    iget v2, p0, Lb30/z1;->z:F

    invoke-direct {p1, v0, v1, v2}, Lb30/a;-><init>(Ljava/util/List;FF)V

    iget-object v0, p0, Lb30/z1;->w:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

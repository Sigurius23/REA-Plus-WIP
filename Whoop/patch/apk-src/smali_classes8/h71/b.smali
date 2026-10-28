.class public final synthetic Lh71/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lp1/c1;

.field public final synthetic G:Lp1/c1;

.field public final synthetic w:Lf0/r1;

.field public final synthetic x:Lh61/a;

.field public final synthetic y:F

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lf0/r1;Lh61/a;FLp1/c1;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh71/b;->w:Lf0/r1;

    iput-object p2, p0, Lh71/b;->x:Lh61/a;

    iput p3, p0, Lh71/b;->y:F

    iput-object p4, p0, Lh71/b;->z:Lp1/c1;

    iput-object p5, p0, Lh71/b;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lh71/b;->F:Lp1/c1;

    iput-object p7, p0, Lh71/b;->G:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v6, p0, Lh71/b;->G:Lp1/c1;

    move-object v7, p1

    check-cast v7, Ld61/a;

    iget-object v0, p0, Lh71/b;->w:Lf0/r1;

    iget-object v1, p0, Lh71/b;->x:Lh61/a;

    iget v2, p0, Lh71/b;->y:F

    iget-object v3, p0, Lh71/b;->z:Lp1/c1;

    iget-object v4, p0, Lh71/b;->E:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lh71/b;->F:Lp1/c1;

    invoke-static/range {v0 .. v7}, Lh71/g;->i(Lf0/r1;Lh61/a;FLp1/c1;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Ld61/a;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method

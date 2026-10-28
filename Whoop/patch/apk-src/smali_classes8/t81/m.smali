.class public final synthetic Lt81/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic F:Lp1/c1;

.field public final synthetic G:Lp1/c1;

.field public final synthetic w:Lt81/r;

.field public final synthetic x:Lf0/r1;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lp1/z0;


# direct methods
.method public synthetic constructor <init>(Lt81/r;Lf0/r1;Lkotlin/jvm/functions/Function1;Lp1/z0;Lp1/c1;Lp1/c1;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt81/m;->w:Lt81/r;

    iput-object p2, p0, Lt81/m;->x:Lf0/r1;

    iput-object p3, p0, Lt81/m;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lt81/m;->z:Lp1/z0;

    iput-object p5, p0, Lt81/m;->E:Lp1/c1;

    iput-object p6, p0, Lt81/m;->F:Lp1/c1;

    iput-object p7, p0, Lt81/m;->G:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    move-object v7, p1

    check-cast v7, Lh2/b;

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result v8

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    iget-object v0, p0, Lt81/m;->w:Lt81/r;

    iget-object v1, p0, Lt81/m;->x:Lf0/r1;

    iget-object v2, p0, Lt81/m;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lt81/m;->z:Lp1/z0;

    iget-object v4, p0, Lt81/m;->E:Lp1/c1;

    iget-object v5, p0, Lt81/m;->F:Lp1/c1;

    iget-object v6, p0, Lt81/m;->G:Lp1/c1;

    invoke-static/range {v0 .. v9}, Lt81/l$b;->a(Lt81/r;Lf0/r1;Lkotlin/jvm/functions/Function1;Lp1/z0;Lp1/c1;Lp1/c1;Lp1/c1;Lh2/b;FZ)Ll83/a0;

    move-result-object p1

    return-object p1
.end method

.class public final synthetic Lg1/r5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:F

.field public final synthetic w:Lkotlin/jvm/functions/Function1;

.field public final synthetic x:Li93/f;

.field public final synthetic y:Li93/e;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Li93/f;Li93/e;Lp1/c1;FI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/r5;->w:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lg1/r5;->x:Li93/f;

    iput-object p3, p0, Lg1/r5;->y:Li93/e;

    iput-object p4, p0, Lg1/r5;->z:Lp1/c1;

    iput p5, p0, Lg1/r5;->E:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p1, 0xc01

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget-object v0, p0, Lg1/r5;->w:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lg1/r5;->x:Li93/f;

    iget-object v2, p0, Lg1/r5;->y:Li93/e;

    iget-object v3, p0, Lg1/r5;->z:Lp1/c1;

    iget v4, p0, Lg1/r5;->E:F

    invoke-static/range {v0 .. v6}, Lg1/g6;->a(Lkotlin/jvm/functions/Function1;Li93/f;Li93/e;Lp1/c1;FLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

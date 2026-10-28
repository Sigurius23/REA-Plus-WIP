.class public abstract Landroidx/compose/foundation/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lep0/a;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lep0/a;-><init>(I)V

    new-instance v1, Lp1/b0;

    invoke-direct {v1, v0}, Lp1/b0;-><init>(Lc93/a;)V

    sput-object v1, Landroidx/compose/foundation/d;->a:Lp1/b0;

    return-void
.end method

.method public static final a(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;)Landroidx/compose/ui/Modifier;
    .locals 1

    if-nez p2, :cond_0

    return-object p0

    :cond_0
    instance-of v0, p2, Lf0/v0;

    if-eqz v0, :cond_1

    new-instance v0, Landroidx/compose/foundation/IndicationModifierElement;

    check-cast p2, Lf0/v0;

    invoke-direct {v0, p2, p1}, Landroidx/compose/foundation/IndicationModifierElement;-><init>(Lf0/v0;Lj0/i;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance v0, Lb30/o4;

    invoke-direct {v0, p2, p1}, Lb30/o4;-><init>(Lf0/v0;Lj0/i;)V

    invoke-static {p0, v0}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

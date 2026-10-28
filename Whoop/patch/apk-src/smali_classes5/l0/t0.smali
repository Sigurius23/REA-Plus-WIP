.class public final Ll0/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll0/s1;
.implements Ll0/s0;


# static fields
.field public static final a:Ll0/t0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ll0/t0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll0/t0;->a:Ll0/t0;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/Modifier;Lb2/l;)Landroidx/compose/ui/Modifier;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/layout/VerticalAlignElement;

    invoke-direct {v0, p2}, Landroidx/compose/foundation/layout/VerticalAlignElement;-><init>(Lb2/l;)V

    invoke-interface {p1, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method

.method public final c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;
    .locals 4

    float-to-double v0, p3

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "invalid weight; must be greater than zero"

    invoke-static {v0}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_0
    new-instance v0, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v2, p3, v1

    if-lez v2, :cond_1

    move p3, v1

    :cond_1
    invoke-direct {v0, p3, p2}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-interface {p1, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method

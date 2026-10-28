.class public abstract Landroidx/compose/foundation/text/handwriting/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La3/q;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x28

    int-to-float v0, v0

    const/16 v1, 0xa

    int-to-float v1, v1

    new-instance v2, La3/q;

    invoke-direct {v2, v1, v0, v1, v0}, La3/q;-><init>(FFFF)V

    sput-object v2, Landroidx/compose/foundation/text/handwriting/a;->a:La3/q;

    return-void
.end method

.method public static final a(ZZLc93/a;)Landroidx/compose/ui/Modifier;
    .locals 1

    sget-object v0, Lb2/t;->w:Lb2/t;

    if-eqz p0, :cond_1

    sget-boolean p0, Lc1/b;->a:Z

    if-eqz p0, :cond_1

    if-eqz p1, :cond_0

    new-instance v0, Landroidx/compose/ui/input/pointer/StylusHoverIconModifierElement;

    sget-object p0, Landroidx/compose/foundation/text/handwriting/a;->a:La3/q;

    invoke-direct {v0, p0}, Landroidx/compose/ui/input/pointer/StylusHoverIconModifierElement;-><init>(La3/q;)V

    :cond_0
    new-instance p0, Landroidx/compose/foundation/text/handwriting/StylusHandwritingElement;

    invoke-direct {p0, p2}, Landroidx/compose/foundation/text/handwriting/StylusHandwritingElement;-><init>(Lc93/a;)V

    invoke-interface {v0, p0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v0
.end method

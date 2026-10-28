.class final Lmi2/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmi2/i;->s(Lji2/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lji2/d;

.field final synthetic x:Lji2/f;


# direct methods
.method public constructor <init>(Lji2/d;Lji2/f;)V
    .locals 0

    iput-object p1, p0, Lmi2/i$a;->w:Lji2/d;

    iput-object p2, p0, Lmi2/i$a;->x:Lji2/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)V
    .locals 10

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p2, v2

    move-object v7, p1

    check-cast v7, Lp1/q;

    invoke-virtual {v7, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Lmh/h;

    sget-object p2, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v7, p2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/Context;

    invoke-direct {p1, p2}, Lmh/h;-><init>(Landroid/content/Context;)V

    iget-object p2, p0, Lmi2/i$a;->w:Lji2/d;

    invoke-virtual {p2}, Lji2/d;->c()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p1, Lmh/h;->c:Ljava/lang/Object;

    invoke-virtual {p1}, Lmh/h;->a()Lmh/j;

    move-result-object v1

    iget-object p1, p0, Lmi2/i$a;->w:Lji2/d;

    invoke-virtual {p1}, Lji2/d;->b()Ljava/lang/String;

    move-result-object v2

    iget-object p1, p0, Lmi2/i$a;->x:Lji2/f;

    invoke-virtual {p1}, Lji2/f;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    const/high16 p1, 0x3f800000    # 1.0f

    :goto_1
    move v6, p1

    goto :goto_2

    :cond_1
    const p1, 0x3e99999a    # 0.3f

    goto :goto_1

    :goto_2
    const/4 v8, 0x0

    const/16 v9, 0x37c

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v9}, Ldc/a;->c(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/m;Ly2/k;FLp1/q;II)V

    return-void

    :cond_2
    invoke-virtual {v7}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lmi2/i$a;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

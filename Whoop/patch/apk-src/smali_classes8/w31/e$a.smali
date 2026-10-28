.class public final Lw31/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw31/e;->h(Lw31/b;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic w:Lw31/b;


# direct methods
.method public constructor <init>(Lw31/b;)V
    .locals 0

    iput-object p1, p0, Lw31/e$a;->w:Lw31/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)V
    .locals 18

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v15, p1

    check-cast v15, Lp1/q;

    invoke-virtual {v15, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_2

    const v0, 0x1283dbfb

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    move-object/from16 v0, p0

    iget-object v1, v0, Lw31/e$a;->w:Lw31/b;

    invoke-static {v1, v15, v2}, Lj93/l0;->W(Ljava/lang/Object;Lp1/q;I)Lg1/n7;

    move-result-object v8

    const/16 v1, 0x50

    int-to-float v4, v1

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v1, v3, :cond_1

    sget-object v1, Lw31/e$b;->w:Lw31/e$b;

    invoke-virtual {v15, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v7, v1

    check-cast v7, Lc93/a;

    sget-object v1, Lx81/d;->a:Lx81/d;

    const/4 v3, 0x6

    invoke-virtual {v1, v15, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v10

    sget-object v1, Lw31/a;->a:Lw31/a;

    invoke-virtual {v1}, Lw31/a;->c()Lkotlin/jvm/functions/Function3;

    move-result-object v14

    const v16, 0x30006c30

    const/16 v17, 0x145

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v9, 0x0

    const-wide/16 v12, 0x0

    invoke-static/range {v3 .. v17}, Lw31/e;->n(Landroidx/compose/ui/Modifier;FZZLc93/a;Lg1/n7;Lgz0/m0;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15, v2}, Lp1/q;->q(Z)V

    return-void

    :cond_2
    move-object/from16 v0, p0

    invoke-virtual {v15}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lw31/e$a;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

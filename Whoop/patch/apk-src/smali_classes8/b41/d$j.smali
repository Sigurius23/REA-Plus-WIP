.class public final Lb41/d$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb41/d;->z(Landroidx/compose/runtime/Composer;I)V
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)V
    .locals 20

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

    move-object/from16 v3, p1

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_2

    const v0, -0x70032044

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    new-instance v4, Lb41/f;

    sget-object v8, Lgz0/m0;->EMAIL:Lgz0/m0;

    const/16 v18, 0x1800

    const/16 v19, 0x0

    const-string v5, "PASSWORD"

    const-string v6, "password"

    const-string v7, "Placeholder"

    const/4 v9, 0x0

    const-string v10, "Error Message"

    const/4 v11, 0x7

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v4 .. v19}, Lb41/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ZZLjava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lb41/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_1

    sget-object v0, Lb41/d$k;->w:Lb41/d$k;

    invoke-virtual {v3, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v0, Lkotlin/jvm/functions/Function1;

    sget v1, Lcom/whoop/navigation/models/GenericInteraction;->$stable:I

    shl-int/lit8 v1, v1, 0x3

    or-int/lit16 v1, v1, 0x186

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v4, v0, v3, v1}, Lb41/d;->F(Landroidx/compose/ui/Modifier;Lb41/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    return-void

    :cond_2
    invoke-virtual {v3}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lb41/d$j;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

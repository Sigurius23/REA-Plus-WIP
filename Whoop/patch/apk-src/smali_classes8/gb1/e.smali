.class public final synthetic Lgb1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Li2/t;

.field public final synthetic w:Li2/a1;

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Li2/a1;FFFLi2/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgb1/e;->w:Li2/a1;

    iput p2, p0, Lgb1/e;->x:F

    iput p3, p0, Lgb1/e;->y:F

    iput p4, p0, Lgb1/e;->z:F

    iput-object p5, p0, Lgb1/e;->E:Li2/t;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    move-object v5, p1

    check-cast v5, Landroidx/compose/ui/Modifier;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v0, p0, Lgb1/e;->w:Li2/a1;

    iget v1, p0, Lgb1/e;->x:F

    iget v2, p0, Lgb1/e;->y:F

    iget v3, p0, Lgb1/e;->z:F

    iget-object v4, p0, Lgb1/e;->E:Li2/t;

    invoke-static/range {v0 .. v7}, Lgb1/g;->b(Li2/a1;FFFLi2/t;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method

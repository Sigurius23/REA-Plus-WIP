.class public final synthetic Li91/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:Li91/a;

.field public final synthetic x:Li2/a1;

.field public final synthetic y:Ljava/lang/Float;


# direct methods
.method public synthetic constructor <init>(Li91/a;Li2/a1;Ljava/lang/Float;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li91/b;->w:Li91/a;

    iput-object p2, p0, Li91/b;->x:Li2/a1;

    iput-object p3, p0, Li91/b;->y:Ljava/lang/Float;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v3, p1

    check-cast v3, Landroidx/compose/ui/Modifier;

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Li91/b;->w:Li91/a;

    iget-object v1, p0, Li91/b;->x:Li2/a1;

    iget-object v2, p0, Li91/b;->y:Ljava/lang/Float;

    invoke-static/range {v0 .. v5}, Li91/c;->b(Li91/a;Li2/a1;Ljava/lang/Float;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method

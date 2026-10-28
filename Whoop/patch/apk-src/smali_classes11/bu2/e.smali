.class public final synthetic Lbu2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:Lm91/u;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lbu2/d;Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lbu2/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbu2/e;->y:Lm91/u;

    iput-object p2, p0, Lbu2/e;->z:Ljava/lang/Object;

    iput p3, p0, Lbu2/e;->x:F

    iput-object p4, p0, Lbu2/e;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Le21/b;FLl3/t0;Lb91/a;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lbu2/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbu2/e;->y:Lm91/u;

    iput p2, p0, Lbu2/e;->x:F

    iput-object p3, p0, Lbu2/e;->z:Ljava/lang/Object;

    iput-object p4, p0, Lbu2/e;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lbu2/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbu2/e;->y:Lm91/u;

    move-object v1, v0

    check-cast v1, Le21/b;

    iget-object v0, p0, Lbu2/e;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ll3/t0;

    iget-object v0, p0, Lbu2/e;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lb91/a;

    move-object v5, p1

    check-cast v5, Ll0/v;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v2, p0, Lbu2/e;->x:F

    invoke-static/range {v1 .. v7}, Le21/c;->a(Le21/b;FLl3/t0;Lb91/a;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lbu2/e;->y:Lm91/u;

    move-object v1, v0

    check-cast v1, Lbu2/d;

    iget-object v0, p0, Lbu2/e;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lbu2/e;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Ll0/v;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v3, p0, Lbu2/e;->x:F

    invoke-static/range {v1 .. v7}, Lbu2/g;->b(Lbu2/d;Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function1;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

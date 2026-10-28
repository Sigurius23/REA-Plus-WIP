.class public final synthetic Ler2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZI)V
    .locals 0

    iput p3, p0, Ler2/d;->w:I

    iput-object p1, p0, Ler2/d;->y:Ljava/lang/Object;

    iput-boolean p2, p0, Ler2/d;->x:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ler2/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ler2/d;->y:Ljava/lang/Object;

    check-cast v0, Lrq2/y;

    check-cast p1, Lc0/i0;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iget-boolean v1, p0, Ler2/d;->x:Z

    invoke-static {v0, v1, p1, p2, p3}, Lrq2/a0;->a(Lrq2/y;ZLc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ler2/d;->y:Ljava/lang/Object;

    check-cast v0, Liw0/l0;

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iget-boolean v1, p0, Ler2/d;->x:Z

    invoke-static {v0, v1, p1, p2, p3}, Liw0/k0;->b(Liw0/l0;ZLandroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Ler2/d;->y:Ljava/lang/Object;

    check-cast v0, Ler2/g;

    check-cast p1, Landroidx/compose/ui/Modifier;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iget-boolean v1, p0, Ler2/d;->x:Z

    invoke-static {v0, v1, p1, p2, p3}, Ler2/e;->e(Ler2/g;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic Ljk2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Ljk2/h;->w:I

    iput-object p2, p0, Ljk2/h;->x:Ljava/lang/Object;

    iput-object p3, p0, Ljk2/h;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Ljk2/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ljk2/h;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroid/content/Intent;

    iget-object v0, p0, Ljk2/h;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v3, p1

    check-cast v3, Lc0/o;

    move-object v4, p2

    check-cast v4, Leb/q;

    move-object v5, p3

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Ll80/n;->v(Landroid/content/Intent;Lkotlin/jvm/functions/Function1;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ljk2/h;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Ljk2/h;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lp1/t2;

    move-object v3, p1

    check-cast v3, Lc0/o;

    move-object v4, p2

    check-cast v4, Leb/q;

    move-object v5, p3

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Ll80/n;->o(Lkotlin/jvm/functions/Function1;Lp1/t2;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Ljk2/h;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lfm1/i;

    iget-object v0, p0, Ljk2/h;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v3, p1

    check-cast v3, Lc0/o;

    move-object v4, p2

    check-cast v4, Ljava/lang/String;

    move-object v5, p3

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Ljk2/i;->m(Lfm1/i;Landroidx/compose/ui/Modifier;Lc0/o;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

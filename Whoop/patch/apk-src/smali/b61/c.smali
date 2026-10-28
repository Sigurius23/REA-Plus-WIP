.class public final synthetic Lb61/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Lb61/l;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic w:I

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:Ljava/util/List;

.field public final synthetic z:Lb2/m;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;Lb2/m;Lb61/l;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p6, p0, Lb61/c;->w:I

    iput-object p1, p0, Lb61/c;->x:Ljava/util/List;

    iput-object p2, p0, Lb61/c;->y:Ljava/util/List;

    iput-object p3, p0, Lb61/c;->z:Lb2/m;

    iput-object p4, p0, Lb61/c;->E:Lb61/l;

    iput-object p5, p0, Lb61/c;->F:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lb61/c;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Lc0/i0;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v1, p0, Lb61/c;->x:Ljava/util/List;

    iget-object v2, p0, Lb61/c;->y:Ljava/util/List;

    iget-object v3, p0, Lb61/c;->z:Lb2/m;

    iget-object v4, p0, Lb61/c;->E:Lb61/l;

    iget-object v5, p0, Lb61/c;->F:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v1 .. v8}, Lb61/k;->h(Ljava/util/List;Ljava/util/List;Lb2/m;Lb61/l;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Lc0/i0;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v0, p0, Lb61/c;->x:Ljava/util/List;

    iget-object v1, p0, Lb61/c;->y:Ljava/util/List;

    iget-object v2, p0, Lb61/c;->z:Lb2/m;

    iget-object v3, p0, Lb61/c;->E:Lb61/l;

    iget-object v4, p0, Lb61/c;->F:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v7}, Lb61/k;->i(Ljava/util/List;Ljava/util/List;Lb2/m;Lb61/l;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic La81/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lfi0/a;

.field public final synthetic F:Lc93/a;

.field public final synthetic G:Lc93/p;

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/design/models/modal/AnyModal;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Liy1/c;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/models/modal/AnyModal;Lkotlin/jvm/functions/Function1;Liy1/c;Lfi0/a;Lc93/a;Lc93/p;III)V
    .locals 0

    iput p9, p0, La81/i;->w:I

    iput-object p1, p0, La81/i;->x:Lcom/whoop/design/models/modal/AnyModal;

    iput-object p2, p0, La81/i;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, La81/i;->z:Liy1/c;

    iput-object p4, p0, La81/i;->E:Lfi0/a;

    iput-object p5, p0, La81/i;->F:Lc93/a;

    iput-object p6, p0, La81/i;->G:Lc93/p;

    iput p7, p0, La81/i;->H:I

    iput p8, p0, La81/i;->I:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, La81/i;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v1, p0, La81/i;->x:Lcom/whoop/design/models/modal/AnyModal;

    iget-object v2, p0, La81/i;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, La81/i;->z:Liy1/c;

    iget-object v4, p0, La81/i;->E:Lfi0/a;

    iget-object v5, p0, La81/i;->F:Lc93/a;

    iget-object v6, p0, La81/i;->G:Lc93/p;

    iget v7, p0, La81/i;->H:I

    iget v8, p0, La81/i;->I:I

    invoke-static/range {v1 .. v10}, La81/o;->q(Lcom/whoop/design/models/modal/AnyModal;Lkotlin/jvm/functions/Function1;Liy1/c;Lfi0/a;Lc93/a;Lc93/p;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v0, p0, La81/i;->x:Lcom/whoop/design/models/modal/AnyModal;

    iget-object v1, p0, La81/i;->y:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, La81/i;->z:Liy1/c;

    iget-object v3, p0, La81/i;->E:Lfi0/a;

    iget-object v4, p0, La81/i;->F:Lc93/a;

    iget-object v5, p0, La81/i;->G:Lc93/p;

    iget v6, p0, La81/i;->H:I

    iget v7, p0, La81/i;->I:I

    invoke-static/range {v0 .. v9}, La81/o;->e(Lcom/whoop/design/models/modal/AnyModal;Lkotlin/jvm/functions/Function1;Liy1/c;Lfi0/a;Lc93/a;Lc93/p;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

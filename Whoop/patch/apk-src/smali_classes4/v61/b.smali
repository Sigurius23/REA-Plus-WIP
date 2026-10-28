.class public final synthetic Lv61/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:Ly61/a;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ly61/a;Lkotlin/jvm/functions/Function1;III)V
    .locals 0

    iput p5, p0, Lv61/b;->w:I

    iput-object p1, p0, Lv61/b;->x:Ly61/a;

    iput-object p2, p0, Lv61/b;->y:Lkotlin/jvm/functions/Function1;

    iput p3, p0, Lv61/b;->z:I

    iput p4, p0, Lv61/b;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lv61/b;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v1, p0, Lv61/b;->x:Ly61/a;

    iget-object v2, p0, Lv61/b;->y:Lkotlin/jvm/functions/Function1;

    iget v3, p0, Lv61/b;->z:I

    iget v4, p0, Lv61/b;->E:I

    invoke-static/range {v1 .. v6}, Lw61/b;->c(Ly61/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lv61/b;->x:Ly61/a;

    iget-object v1, p0, Lv61/b;->y:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lv61/b;->z:I

    iget v3, p0, Lv61/b;->E:I

    invoke-static/range {v0 .. v5}, Lv61/c;->a(Ly61/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic Liw0/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(ZLkotlin/jvm/functions/Function1;Ljava/util/Map;II)V
    .locals 0

    iput p5, p0, Liw0/u;->w:I

    iput-boolean p1, p0, Liw0/u;->x:Z

    iput-object p2, p0, Liw0/u;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Liw0/u;->z:Ljava/util/Map;

    iput p4, p0, Liw0/u;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Liw0/u;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v1, p0, Liw0/u;->x:Z

    iget-object v2, p0, Liw0/u;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Liw0/u;->z:Ljava/util/Map;

    iget v4, p0, Liw0/u;->E:I

    invoke-static/range {v1 .. v6}, Liw0/x;->e(ZLkotlin/jvm/functions/Function1;Ljava/util/Map;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-boolean v0, p0, Liw0/u;->x:Z

    iget-object v1, p0, Liw0/u;->y:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Liw0/u;->z:Ljava/util/Map;

    iget v3, p0, Liw0/u;->E:I

    invoke-static/range {v0 .. v5}, Liw0/x;->E(ZLkotlin/jvm/functions/Function1;Ljava/util/Map;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

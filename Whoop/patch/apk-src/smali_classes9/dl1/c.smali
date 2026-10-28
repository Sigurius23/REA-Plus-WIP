.class public final synthetic Ldl1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;IILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput p3, p0, Ldl1/c;->w:I

    iput-object p4, p0, Ldl1/c;->x:Ljava/lang/String;

    iput-object p5, p0, Ldl1/c;->y:Ljava/lang/String;

    iput-object p1, p0, Ldl1/c;->z:Lkotlin/jvm/functions/Function1;

    iput p2, p0, Ldl1/c;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Ldl1/c;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v1, p0, Ldl1/c;->x:Ljava/lang/String;

    iget-object v2, p0, Ldl1/c;->y:Ljava/lang/String;

    iget-object v3, p0, Ldl1/c;->z:Lkotlin/jvm/functions/Function1;

    iget v4, p0, Ldl1/c;->E:I

    invoke-static/range {v1 .. v6}, Lzo2/f;->c(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Ldl1/c;->x:Ljava/lang/String;

    iget-object v1, p0, Ldl1/c;->y:Ljava/lang/String;

    iget-object v2, p0, Ldl1/c;->z:Lkotlin/jvm/functions/Function1;

    iget v3, p0, Ldl1/c;->E:I

    invoke-static/range {v0 .. v5}, Ldl1/d;->c(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

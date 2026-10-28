.class public final Lb30/a2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final x:I

.field public final y:Ljava/lang/Object;

.field public final z:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/util/List;II)V
    .locals 0

    iput p4, p0, Lb30/a2;->w:I

    iput-object p1, p0, Lb30/a2;->y:Ljava/lang/Object;

    iput-object p2, p0, Lb30/a2;->z:Ljava/util/List;

    iput p3, p0, Lb30/a2;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lb30/a2;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb30/a2;->y:Ljava/lang/Object;

    check-cast v0, Llg3/q;

    iget-object v1, p0, Lb30/a2;->z:Ljava/util/List;

    check-cast v1, Ljava/util/ArrayList;

    iget v2, p0, Lb30/a2;->x:I

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lna3/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v1, Lna3/b;->c:Lob3/m;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    iget-object v0, v0, Llg3/q;->f:Ljava/io/Serializable;

    check-cast v0, Lfa3/a;

    sget-object v5, Lfa3/a;->F:Lfa3/a;

    if-ne v0, v5, :cond_1

    move v3, v4

    :cond_1
    if-nez v2, :cond_3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    sget-object v0, Lfa3/a;->E:Lfa3/a;

    :cond_3
    :goto_1
    iget-object v1, v1, Lna3/b;->b:Lfa3/t;

    if-eqz v1, :cond_4

    iget-object v1, v1, Lfa3/t;->a:Ljava/util/EnumMap;

    invoke-virtual {v1, v0}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfa3/m;

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    :goto_2
    return-object v0

    :pswitch_0
    iget-object v0, p0, Lb30/a2;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lb30/a2;->z:Ljava/util/List;

    iget v2, p0, Lb30/a2;->x:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

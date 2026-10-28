.class public final synthetic Lb61/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lgt2/c;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/c1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lb61/j;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb61/j;->z:Ljava/lang/Object;

    iput-object p2, p0, Lb61/j;->x:Ljava/lang/Object;

    iput-object p3, p0, Lb61/j;->E:Ljava/lang/Object;

    iput-object p4, p0, Lb61/j;->y:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p5, p0, Lb61/j;->w:I

    iput-object p1, p0, Lb61/j;->y:Ljava/lang/Object;

    iput-object p2, p0, Lb61/j;->z:Ljava/lang/Object;

    iput-object p3, p0, Lb61/j;->E:Ljava/lang/Object;

    iput-object p4, p0, Lb61/j;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lb61/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb61/j;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lj93/d;

    iget-object v0, p0, Lb61/j;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ltr2/n;

    iget-object v0, p0, Lb61/j;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, p0, Lb61/j;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lrr2/c;

    move-object v5, p1

    check-cast v5, Lad3/k;

    move-object v6, p2

    check-cast v6, Lkotlinx/serialization/json/JsonElement;

    invoke-static/range {v1 .. v6}, Lo91/b;->a(Lj93/d;Ltr2/n;Ljava/lang/String;Lrr2/c;Lad3/k;Lkotlinx/serialization/json/JsonElement;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lb61/j;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lgt2/c;

    iget-object v0, p0, Lb61/j;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lb61/j;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, p0, Lb61/j;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lp1/c1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Lht2/e;->k(Lgt2/c;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lb61/j;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lp1/c1;

    iget-object v0, p0, Lb61/j;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lp1/c1;

    iget-object v0, p0, Lb61/j;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lb61/l;

    iget-object v0, p0, Lb61/j;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Lb61/k;->c(Lp1/c1;Lp1/c1;Lb61/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

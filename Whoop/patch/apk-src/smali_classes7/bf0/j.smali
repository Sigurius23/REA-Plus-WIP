.class public final synthetic Lbf0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Z

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/b2;ZLcom/whoop/design/util/TextResource;Lcr2/h;Lcom/whoop/design/util/TextResource;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lbf0/j;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbf0/j;->z:Ljava/lang/Object;

    iput-object p2, p0, Lbf0/j;->E:Ljava/lang/Object;

    iput-object p3, p0, Lbf0/j;->F:Ljava/lang/Object;

    iput-boolean p4, p0, Lbf0/j;->y:Z

    iput-object p5, p0, Lbf0/j;->G:Ljava/lang/Object;

    iput-object p6, p0, Lbf0/j;->x:Ljava/lang/Object;

    iput-object p7, p0, Lbf0/j;->H:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p8, p0, Lbf0/j;->w:I

    iput-object p1, p0, Lbf0/j;->z:Ljava/lang/Object;

    iput-object p2, p0, Lbf0/j;->E:Ljava/lang/Object;

    iput-boolean p3, p0, Lbf0/j;->y:Z

    iput-object p4, p0, Lbf0/j;->F:Ljava/lang/Object;

    iput-object p5, p0, Lbf0/j;->G:Ljava/lang/Object;

    iput-object p6, p0, Lbf0/j;->x:Ljava/lang/Object;

    iput-object p7, p0, Lbf0/j;->H:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZLhy0/h1;Ll83/p;)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput v0, p0, Lbf0/j;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbf0/j;->x:Ljava/lang/Object;

    iput-object p2, p0, Lbf0/j;->z:Ljava/lang/Object;

    iput-object p3, p0, Lbf0/j;->E:Ljava/lang/Object;

    iput-object p4, p0, Lbf0/j;->F:Ljava/lang/Object;

    iput-boolean p5, p0, Lbf0/j;->y:Z

    iput-object p6, p0, Lbf0/j;->G:Ljava/lang/Object;

    iput-object p7, p0, Lbf0/j;->H:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lbf0/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbf0/j;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkm0/f;

    iget-object v0, p0, Lbf0/j;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ln0/u;

    iget-object v0, p0, Lbf0/j;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    iget-object v0, p0, Lbf0/j;->G:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lc93/a;

    iget-object v0, p0, Lbf0/j;->x:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lbf0/j;->H:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Ljava/util/List;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-boolean v3, p0, Lbf0/j;->y:Z

    invoke-static/range {v1 .. v9}, Lzr1/c;->f(Lkm0/f;Ln0/u;ZLjava/util/List;Lc93/a;Lkotlin/jvm/functions/Function1;Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lbf0/j;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lbf0/j;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lbf0/j;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lhy0/b2;

    iget-object v0, p0, Lbf0/j;->G:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lbf0/j;->x:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lcr2/h;

    iget-object v0, p0, Lbf0/j;->H:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lcom/whoop/design/util/TextResource;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-boolean v4, p0, Lbf0/j;->y:Z

    invoke-static/range {v1 .. v9}, Lcr2/b;->a(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/b2;ZLcom/whoop/design/util/TextResource;Lcr2/h;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lbf0/j;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lbf0/j;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lp1/c1;

    iget-object v0, p0, Lbf0/j;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    iget-object v0, p0, Lbf0/j;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lbf0/j;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lhy0/h1;

    iget-object v0, p0, Lbf0/j;->H:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Ll83/p;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-boolean v5, p0, Lbf0/j;->y:Z

    invoke-static/range {v1 .. v9}, Lc41/y4;->i(Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZLhy0/h1;Ll83/p;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lbf0/j;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lze0/c$e;

    iget-object v0, p0, Lbf0/j;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lzr2/a;

    iget-object v0, p0, Lbf0/j;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lbc3/c0;

    iget-object v0, p0, Lbf0/j;->G:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lg1/y3;

    iget-object v0, p0, Lbf0/j;->x:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lbf0/j;->H:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-boolean v3, p0, Lbf0/j;->y:Z

    invoke-static/range {v1 .. v9}, Lbf0/k;->p(Lze0/c$e;Lzr2/a;ZLbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

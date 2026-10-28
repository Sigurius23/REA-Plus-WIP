.class public final Landroidx/fragment/app/j2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/util/List;

.field public final synthetic z:Ljava/util/List;


# direct methods
.method public constructor <init>(ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Landroidx/fragment/app/j2;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/fragment/app/j2;->x:I

    iput-object p2, p0, Landroidx/fragment/app/j2;->y:Ljava/util/List;

    iput-object p3, p0, Landroidx/fragment/app/j2;->z:Ljava/util/List;

    iput-object p4, p0, Landroidx/fragment/app/j2;->E:Ljava/lang/Object;

    iput-object p5, p0, Landroidx/fragment/app/j2;->F:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p6, p0, Landroidx/fragment/app/j2;->w:I

    iput-object p1, p0, Landroidx/fragment/app/j2;->F:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/fragment/app/j2;->y:Ljava/util/List;

    iput-object p3, p0, Landroidx/fragment/app/j2;->z:Ljava/util/List;

    iput p4, p0, Landroidx/fragment/app/j2;->x:I

    iput-object p5, p0, Landroidx/fragment/app/j2;->E:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    iget v0, p0, Landroidx/fragment/app/j2;->w:I

    iget-object v1, p0, Landroidx/fragment/app/j2;->z:Ljava/util/List;

    iget-object v2, p0, Landroidx/fragment/app/j2;->y:Ljava/util/List;

    const/4 v3, 0x0

    iget-object v4, p0, Landroidx/fragment/app/j2;->F:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v2, Lib/n;

    iget-object v6, v2, Lib/n;->z:Lib/r;

    check-cast v1, Lib/n;

    iget-object v8, v1, Lib/n;->z:Lib/r;

    check-cast v4, Lib/c;

    iget-object v0, v4, Lib/c;->b:Lqg3/d;

    iget-object v0, v0, Lqg3/d;->y:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Landroidx/recyclerview/widget/u;

    invoke-virtual {v6}, Lib/r;->c()I

    move-result v7

    invoke-virtual {v8}, Lib/r;->c()I

    move-result v0

    invoke-virtual {v6}, Lib/r;->size()I

    move-result v1

    sub-int/2addr v1, v7

    invoke-virtual {v6}, Lib/r;->d()I

    move-result v2

    sub-int v10, v1, v2

    invoke-virtual {v8}, Lib/r;->size()I

    move-result v1

    sub-int/2addr v1, v0

    invoke-virtual {v8}, Lib/r;->d()I

    move-result v0

    sub-int v11, v1, v0

    new-instance v5, Lib/s;

    invoke-direct/range {v5 .. v11}, Lib/s;-><init>(Lib/r;ILib/r;Landroidx/recyclerview/widget/u;II)V

    invoke-static {v5}, Landroidx/recyclerview/widget/d;->c(Landroidx/recyclerview/widget/d;)Landroidx/recyclerview/widget/t;

    move-result-object v0

    new-instance v1, Lds/s;

    const/16 v2, 0x9

    invoke-direct {v1, p0, v0, v3, v2}, Lds/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    invoke-static {}, Lt/a;->V()Lt/a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lt/a;->W(Ljava/lang/Runnable;)V

    return-void

    :pswitch_0
    new-instance v0, Landroidx/recyclerview/widget/e;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/e;-><init>(Landroidx/fragment/app/j2;)V

    invoke-static {v0}, Landroidx/recyclerview/widget/d;->c(Landroidx/recyclerview/widget/d;)Landroidx/recyclerview/widget/t;

    move-result-object v0

    check-cast v4, Landroidx/recyclerview/widget/h;

    iget-object v1, v4, Landroidx/recyclerview/widget/h;->c:Landroidx/recyclerview/widget/g;

    new-instance v2, Lds/s;

    const/4 v4, 0x1

    invoke-direct {v2, p0, v0, v3, v4}, Lds/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/g;->execute(Ljava/lang/Runnable;)V

    return-void

    :goto_0
    :pswitch_1
    iget v0, p0, Landroidx/fragment/app/j2;->x:I

    if-ge v3, v0, :cond_0

    move-object v0, v2

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    move-object v5, v1

    check-cast v5, Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    sget-object v6, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {v0, v5}, Lh5/h0;->m(Landroid/view/View;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/j2;->E:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    move-object v5, v4

    check-cast v5, Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v0, v5}, Lh5/h0;->m(Landroid/view/View;Ljava/lang/String;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

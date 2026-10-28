.class public final Le2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnDragListener;
.implements Le2/c;


# instance fields
.field public final a:Le2/f;

.field public final b:La0/h;

.field public final c:Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager$modifier$1;


# direct methods
.method public constructor <init>(Lb3/s;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Le2/f;

    invoke-direct {p1}, Lb2/v;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p1, Le2/f;->Q:J

    iput-object p1, p0, Le2/a;->a:Le2/f;

    new-instance p1, La0/h;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, La0/h;-><init>(I)V

    iput-object p1, p0, Le2/a;->b:La0/h;

    new-instance p1, Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager$modifier$1;

    invoke-direct {p1, p0}, Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager$modifier$1;-><init>(Le2/a;)V

    iput-object p1, p0, Le2/a;->c:Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager$modifier$1;

    return-void
.end method


# virtual methods
.method public final onDrag(Landroid/view/View;Landroid/view/DragEvent;)Z
    .locals 4

    new-instance p1, Le10/k0;

    const/4 v0, 0x1

    invoke-direct {p1, p2, v0}, Le10/k0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p2}, Landroid/view/DragEvent;->getAction()I

    move-result p2

    iget-object v0, p0, Le2/a;->b:La0/h;

    const/4 v1, 0x0

    iget-object v2, p0, Le2/a;->a:Le2/f;

    packed-switch p2, :pswitch_data_0

    return v1

    :pswitch_0
    invoke-virtual {v2, p1}, Le2/f;->Z0(Le10/k0;)V

    return v1

    :pswitch_1
    invoke-virtual {v2, p1}, Le2/f;->Y0(Le10/k0;)V

    return v1

    :pswitch_2
    new-instance p2, La0/a1;

    const/16 v3, 0x10

    invoke-direct {p2, p1, v3}, La0/a1;-><init>(Ljava/lang/Object;I)V

    invoke-static {v2, p2}, Le4/a;->p(La3/p2;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, La0/h;->clear()V

    return v1

    :pswitch_3
    invoke-virtual {v2, p1}, Le2/f;->X0(Le10/k0;)Z

    move-result p1

    return p1

    :pswitch_4
    invoke-virtual {v2, p1}, Le2/f;->a1(Le10/k0;)V

    return v1

    :pswitch_5
    new-instance p2, Lkotlin/jvm/internal/b0;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    new-instance v1, Le2/e;

    invoke-direct {v1, p1, v2, p2}, Le2/e;-><init>(Le10/k0;Le2/f;Lkotlin/jvm/internal/b0;)V

    invoke-static {v2, v1}, Le4/a;->p(La3/p2;Lkotlin/jvm/functions/Function1;)V

    iget-boolean p2, p2, Lkotlin/jvm/internal/b0;->w:Z

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, La0/b;

    invoke-direct {v1, v0}, La0/b;-><init>(La0/h;)V

    :goto_0
    invoke-virtual {v1}, La0/m;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, La0/m;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le2/f;

    invoke-virtual {v0, p1}, Le2/f;->b1(Le10/k0;)V

    goto :goto_0

    :cond_0
    return p2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

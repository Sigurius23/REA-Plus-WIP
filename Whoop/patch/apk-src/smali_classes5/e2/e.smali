.class public final Le2/e;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/internal/b0;


# direct methods
.method public constructor <init>(Le10/k0;Le2/f;Lkotlin/jvm/internal/b0;)V
    .locals 0

    const/4 p1, 0x0

    iput p1, p0, Le2/e;->w:I

    .line 1
    iput-object p3, p0, Le2/e;->x:Lkotlin/jvm/internal/b0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/b0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Le2/e;->w:I

    .line 2
    iput-object p1, p0, Le2/e;->x:Lkotlin/jvm/internal/b0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Le2/e;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lu2/e;

    iget-boolean p1, p1, Lu2/e;->Q:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Le2/e;->x:Lkotlin/jvm/internal/b0;

    const/4 v0, 0x0

    iput-boolean v0, p1, Lkotlin/jvm/internal/b0;->w:Z

    sget-object p1, La3/o2;->y:La3/o2;

    goto :goto_0

    :cond_0
    sget-object p1, La3/o2;->w:La3/o2;

    :goto_0
    return-object p1

    :pswitch_0
    check-cast p1, Le2/f;

    iget-boolean v0, p1, Lb2/v;->N:Z

    if-nez v0, :cond_1

    sget-object p1, La3/o2;->x:La3/o2;

    goto :goto_2

    :cond_1
    iget-object v0, p1, Le2/f;->P:Le2/f;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    const-string v0, "DragAndDropTarget self reference must be null at the start of a drag and drop session"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :goto_1
    const/4 v0, 0x0

    iput-object v0, p1, Le2/f;->P:Le2/f;

    iget-object p1, p0, Le2/e;->x:Lkotlin/jvm/internal/b0;

    iget-boolean v0, p1, Lkotlin/jvm/internal/b0;->w:Z

    iput-boolean v0, p1, Lkotlin/jvm/internal/b0;->w:Z

    sget-object p1, La3/o2;->w:La3/o2;

    :goto_2
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

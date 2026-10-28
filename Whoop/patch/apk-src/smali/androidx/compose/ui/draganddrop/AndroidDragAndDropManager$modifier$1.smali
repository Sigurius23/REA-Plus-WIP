.class public final Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager$modifier$1;
.super La3/h1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La3/h1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "androidx/compose/ui/draganddrop/AndroidDragAndDropManager$modifier$1",
        "La3/h1;",
        "Le2/f;",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic w:Le2/a;


# direct methods
.method public constructor <init>(Le2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager$modifier$1;->w:Le2/a;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager$modifier$1;->w:Le2/a;

    iget-object v0, v0, Le2/a;->a:Le2/f;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager$modifier$1;->w:Le2/a;

    iget-object v0, v0, Le2/a;->a:Le2/f;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 1

    const-string v0, "RootDragAndDropNode"

    invoke-virtual {p1, v0}, Lb3/l2;->c(Ljava/lang/String;)V

    return-void
.end method

.method public final bridge synthetic update(Lb2/v;)V
    .locals 0

    check-cast p1, Le2/f;

    return-void
.end method

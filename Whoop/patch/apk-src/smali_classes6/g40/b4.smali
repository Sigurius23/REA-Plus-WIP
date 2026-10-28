.class public final synthetic Lg40/b4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:Z


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;IZI)V
    .locals 0

    iput p4, p0, Lg40/b4;->w:I

    iput-object p1, p0, Lg40/b4;->x:Ljava/util/List;

    iput-boolean p3, p0, Lg40/b4;->y:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lg40/b4;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    packed-switch v0, :pswitch_data_0

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lg40/b4;->x:Ljava/util/List;

    iget-boolean v1, p0, Lg40/b4;->y:Z

    invoke-static {v0, v1, p1, p2}, Lg40/j4;->a(Ljava/util/List;ZLandroidx/compose/runtime/Composer;I)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lg40/b4;->x:Ljava/util/List;

    iget-boolean v1, p0, Lg40/b4;->y:Z

    invoke-static {v0, v1, p1, p2}, Lg40/j4;->a(Ljava/util/List;ZLandroidx/compose/runtime/Composer;I)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic Ls50/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ls50/d;

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Ls50/d;II)V
    .locals 0

    iput p3, p0, Ls50/b;->w:I

    iput-object p1, p0, Ls50/b;->x:Ls50/d;

    iput p2, p0, Ls50/b;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ls50/b;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ls50/b;->x:Ls50/d;

    iget v1, p0, Ls50/b;->y:I

    invoke-static {v0, v1, p1, p2}, Ls50/c;->b(Ls50/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ls50/b;->x:Ls50/d;

    iget v1, p0, Ls50/b;->y:I

    invoke-static {v0, v1, p1, p2}, Ls50/c;->d(Ls50/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

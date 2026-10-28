.class public final synthetic Lu51/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lu51/d;

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Lu51/d;II)V
    .locals 0

    iput p3, p0, Lu51/b;->w:I

    iput-object p1, p0, Lu51/b;->x:Lu51/d;

    iput p2, p0, Lu51/b;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lu51/b;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lu51/b;->x:Lu51/d;

    iget v1, p0, Lu51/b;->y:I

    invoke-static {v0, v1, p1, p2}, Lu51/c;->g(Lu51/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lu51/b;->x:Lu51/d;

    iget v1, p0, Lu51/b;->y:I

    invoke-static {v0, v1, p1, p2}, Lu51/c;->d(Lu51/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

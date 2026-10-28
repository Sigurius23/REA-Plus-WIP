.class public final synthetic Lfr2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lfr2/b;

.field public final synthetic y:Z

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lfr2/b;ZII)V
    .locals 0

    iput p4, p0, Lfr2/c;->w:I

    iput-object p1, p0, Lfr2/c;->x:Lfr2/b;

    iput-boolean p2, p0, Lfr2/c;->y:Z

    iput p3, p0, Lfr2/c;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lfr2/c;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lfr2/c;->x:Lfr2/b;

    iget-boolean v1, p0, Lfr2/c;->y:Z

    iget v2, p0, Lfr2/c;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lfr2/f;->c(Lfr2/b;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lfr2/c;->x:Lfr2/b;

    iget-boolean v1, p0, Lfr2/c;->y:Z

    iget v2, p0, Lfr2/c;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lfr2/d;->a(Lfr2/b;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic Luq2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Luq2/d;

.field public final synthetic y:Z

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Luq2/d;ZII)V
    .locals 0

    iput p4, p0, Luq2/f;->w:I

    iput-object p1, p0, Luq2/f;->x:Luq2/d;

    iput-boolean p2, p0, Luq2/f;->y:Z

    iput p3, p0, Luq2/f;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Luq2/f;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Luq2/f;->x:Luq2/d;

    iget-boolean v1, p0, Luq2/f;->y:Z

    iget v2, p0, Luq2/f;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Luq2/h;->a(Luq2/d;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Luq2/f;->x:Luq2/d;

    iget-boolean v1, p0, Luq2/f;->y:Z

    iget v2, p0, Luq2/f;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Luq2/g;->d(Luq2/d;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

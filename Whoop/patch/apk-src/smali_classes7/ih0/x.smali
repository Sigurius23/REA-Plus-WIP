.class public final synthetic Lih0/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:Z


# direct methods
.method public synthetic constructor <init>(FIZ)V
    .locals 0

    .line 1
    iput p2, p0, Lih0/x;->w:I

    iput p1, p0, Lih0/x;->x:F

    iput-boolean p3, p0, Lih0/x;->y:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZF)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lih0/x;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lih0/x;->y:Z

    iput p2, p0, Lih0/x;->x:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lih0/x;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lih0/x;->x:F

    iget-boolean v1, p0, Lih0/x;->y:Z

    invoke-static {v0, v1, p1, p2}, Ln03/f;->s(FZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v0, p0, Lih0/x;->x:F

    iget-boolean v1, p0, Lih0/x;->y:Z

    invoke-static {v0, v1, p1, p2}, Lk03/n;->a(FZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget v0, p0, Lih0/x;->x:F

    iget-boolean v1, p0, Lih0/x;->y:Z

    invoke-static {v0, v1, p1, p2}, Lih0/e0;->p(FZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

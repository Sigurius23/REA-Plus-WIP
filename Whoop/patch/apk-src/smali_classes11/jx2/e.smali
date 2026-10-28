.class public final synthetic Ljx2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lo12/e;


# direct methods
.method public synthetic constructor <init>(Lo12/e;I)V
    .locals 0

    iput p2, p0, Ljx2/e;->w:I

    iput-object p1, p0, Ljx2/e;->x:Lo12/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ljx2/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ljx2/e;->x:Lo12/e;

    invoke-static {v0}, Ljx2/f;->o(Lo12/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ljx2/e;->x:Lo12/e;

    invoke-static {v0}, Ljx2/f;->B(Lo12/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

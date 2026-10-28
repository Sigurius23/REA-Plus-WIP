.class public final synthetic Lch0/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lch0/o0;


# direct methods
.method public synthetic constructor <init>(Lch0/o0;I)V
    .locals 0

    iput p2, p0, Lch0/r0;->w:I

    iput-object p1, p0, Lch0/r0;->x:Lch0/o0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lch0/r0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lch0/r0;->x:Lch0/o0;

    invoke-static {v0}, Lch0/q0;->a(Lch0/o0;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lch0/r0;->x:Lch0/o0;

    invoke-static {v0}, Lch0/o0;->b(Lch0/o0;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lch0/r0;->x:Lch0/o0;

    invoke-static {v0}, Lch0/q0$i;->f(Lch0/o0;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

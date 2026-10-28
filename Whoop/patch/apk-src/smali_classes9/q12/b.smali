.class public final synthetic Lq12/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:Lf0/r1;


# direct methods
.method public synthetic constructor <init>(FLf0/r1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lq12/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lq12/b;->y:Lf0/r1;

    iput p1, p0, Lq12/b;->x:F

    return-void
.end method

.method public synthetic constructor <init>(FLf0/r1;I)V
    .locals 0

    .line 2
    iput p3, p0, Lq12/b;->w:I

    iput p1, p0, Lq12/b;->x:F

    iput-object p2, p0, Lq12/b;->y:Lf0/r1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lq12/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lq12/b;->x:F

    iget-object v1, p0, Lq12/b;->y:Lf0/r1;

    invoke-static {v0, v1}, Lzq0/f;->o(FLf0/r1;)F

    move-result v0

    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget v0, p0, Lq12/b;->x:F

    iget-object v1, p0, Lq12/b;->y:Lf0/r1;

    invoke-static {v0, v1}, Lwr0/j0;->f(FLf0/r1;)F

    move-result v0

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lq12/b;->y:Lf0/r1;

    iget v1, p0, Lq12/b;->x:F

    invoke-static {v1, v0}, Lq12/d;->e(FLf0/r1;)F

    move-result v0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

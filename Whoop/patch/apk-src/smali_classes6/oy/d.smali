.class public final synthetic Loy/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(ZZLc93/a;II)V
    .locals 0

    iput p5, p0, Loy/d;->w:I

    iput-boolean p1, p0, Loy/d;->x:Z

    iput-boolean p2, p0, Loy/d;->y:Z

    iput-object p3, p0, Loy/d;->z:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Loy/d;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    packed-switch v0, :pswitch_data_0

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-boolean v0, p0, Loy/d;->x:Z

    iget-boolean v1, p0, Loy/d;->y:Z

    iget-object v2, p0, Loy/d;->z:Lc93/a;

    invoke-static {v0, v1, v2, p1, p2}, Lp00/h;->d(ZZLc93/a;Landroidx/compose/runtime/Composer;I)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    const/4 p2, 0x7

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-boolean v0, p0, Loy/d;->x:Z

    iget-boolean v1, p0, Loy/d;->y:Z

    iget-object v2, p0, Loy/d;->z:Lc93/a;

    invoke-static {v0, v1, v2, p1, p2}, Lio/sentry/config/a;->d(ZZLc93/a;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

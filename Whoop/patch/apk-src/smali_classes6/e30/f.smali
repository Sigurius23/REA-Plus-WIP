.class public final synthetic Le30/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:La33/d;


# direct methods
.method public synthetic constructor <init>(ZLa33/d;I)V
    .locals 0

    iput p3, p0, Le30/f;->w:I

    iput-boolean p1, p0, Le30/f;->x:Z

    iput-object p2, p0, Le30/f;->y:La33/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Le30/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Le30/f;->x:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Le30/f;->y:La33/d;

    iget-object v0, v0, La33/d;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/i;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-boolean v0, p0, Le30/f;->x:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Le30/f;->y:La33/d;

    iget-object v0, v0, La33/d;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/i;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

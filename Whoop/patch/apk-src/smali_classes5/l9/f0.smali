.class public final synthetic Ll9/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx8/d;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lg9/d;

.field public final synthetic y:Ll9/t;

.field public final synthetic z:Ll9/y;


# direct methods
.method public synthetic constructor <init>(Lg9/d;Ll9/t;Ll9/y;I)V
    .locals 0

    iput p4, p0, Ll9/f0;->w:I

    iput-object p1, p0, Ll9/f0;->x:Lg9/d;

    iput-object p2, p0, Ll9/f0;->y:Ll9/t;

    iput-object p3, p0, Ll9/f0;->z:Ll9/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 4

    iget v0, p0, Ll9/f0;->w:I

    check-cast p1, Ll9/i0;

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll9/f0;->x:Lg9/d;

    iget v1, v0, Lg9/d;->a:I

    iget-object v0, v0, Lg9/d;->b:Ll9/c0;

    iget-object v2, p0, Ll9/f0;->y:Ll9/t;

    iget-object v3, p0, Ll9/f0;->z:Ll9/y;

    invoke-interface {p1, v1, v0, v2, v3}, Ll9/i0;->c(ILl9/c0;Ll9/t;Ll9/y;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ll9/f0;->x:Lg9/d;

    iget v1, v0, Lg9/d;->a:I

    iget-object v0, v0, Lg9/d;->b:Ll9/c0;

    iget-object v2, p0, Ll9/f0;->y:Ll9/t;

    iget-object v3, p0, Ll9/f0;->z:Ll9/y;

    invoke-interface {p1, v1, v0, v2, v3}, Ll9/i0;->a(ILl9/c0;Ll9/t;Ll9/y;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

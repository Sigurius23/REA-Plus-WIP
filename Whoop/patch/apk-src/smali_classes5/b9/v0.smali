.class public final synthetic Lb9/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic E:Ll9/y;

.field public final synthetic w:I

.field public final synthetic x:Lb9/y0;

.field public final synthetic y:Landroid/util/Pair;

.field public final synthetic z:Ll9/t;


# direct methods
.method public synthetic constructor <init>(Lb9/y0;Landroid/util/Pair;Ll9/t;Ll9/y;I)V
    .locals 0

    iput p5, p0, Lb9/v0;->w:I

    iput-object p1, p0, Lb9/v0;->x:Lb9/y0;

    iput-object p2, p0, Lb9/v0;->y:Landroid/util/Pair;

    iput-object p3, p0, Lb9/v0;->z:Ll9/t;

    iput-object p4, p0, Lb9/v0;->E:Ll9/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget v0, p0, Lb9/v0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb9/v0;->x:Lb9/y0;

    iget-object v0, v0, Lb9/y0;->x:Lb9/b1;

    iget-object v0, v0, Lb9/b1;->j:Ljava/lang/Object;

    check-cast v0, Lc9/h;

    iget-object v1, p0, Lb9/v0;->y:Landroid/util/Pair;

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ll9/c0;

    iget-object v3, p0, Lb9/v0;->z:Ll9/t;

    iget-object v4, p0, Lb9/v0;->E:Ll9/y;

    invoke-virtual {v0, v2, v1, v3, v4}, Lc9/h;->a(ILl9/c0;Ll9/t;Ll9/y;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lb9/v0;->x:Lb9/y0;

    iget-object v0, v0, Lb9/y0;->x:Lb9/b1;

    iget-object v0, v0, Lb9/b1;->j:Ljava/lang/Object;

    check-cast v0, Lc9/h;

    iget-object v1, p0, Lb9/v0;->y:Landroid/util/Pair;

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ll9/c0;

    iget-object v3, p0, Lb9/v0;->z:Ll9/t;

    iget-object v4, p0, Lb9/v0;->E:Ll9/y;

    invoke-virtual {v0, v2, v1, v3, v4}, Lc9/h;->c(ILl9/c0;Ll9/t;Ll9/y;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

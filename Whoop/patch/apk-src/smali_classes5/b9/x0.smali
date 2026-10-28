.class public final synthetic Lb9/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/io/IOException;

.field public final synthetic y:Z

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/io/IOException;ZI)V
    .locals 0

    iput p7, p0, Lb9/x0;->w:I

    iput-object p1, p0, Lb9/x0;->z:Ljava/lang/Object;

    iput-object p2, p0, Lb9/x0;->E:Ljava/lang/Object;

    iput-object p3, p0, Lb9/x0;->F:Ljava/lang/Object;

    iput-object p4, p0, Lb9/x0;->G:Ljava/lang/Object;

    iput-object p5, p0, Lb9/x0;->x:Ljava/io/IOException;

    iput-boolean p6, p0, Lb9/x0;->y:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    iget v0, p0, Lb9/x0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb9/x0;->z:Ljava/lang/Object;

    check-cast v0, Lsn/z;

    iget-object v1, p0, Lb9/x0;->E:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lsn/a0;

    iget-object v1, p0, Lb9/x0;->F:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Lsn/m;

    iget-object v1, p0, Lb9/x0;->G:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Ll9/y;

    iget v3, v0, Lsn/z;->a:I

    iget-object v4, v0, Lsn/z;->b:Lsn/v;

    iget-object v7, p0, Lb9/x0;->x:Ljava/io/IOException;

    iget-boolean v8, p0, Lb9/x0;->y:Z

    invoke-interface/range {v2 .. v8}, Lsn/a0;->A(ILsn/v;Lsn/m;Ll9/y;Ljava/io/IOException;Z)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lb9/x0;->z:Ljava/lang/Object;

    check-cast v0, Lb9/y0;

    iget-object v1, p0, Lb9/x0;->E:Ljava/lang/Object;

    check-cast v1, Landroid/util/Pair;

    iget-object v2, p0, Lb9/x0;->F:Ljava/lang/Object;

    move-object v6, v2

    check-cast v6, Ll9/t;

    iget-object v2, p0, Lb9/x0;->G:Ljava/lang/Object;

    move-object v7, v2

    check-cast v7, Ll9/y;

    iget-object v0, v0, Lb9/y0;->x:Lb9/b1;

    iget-object v0, v0, Lb9/b1;->j:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc9/h;

    iget-object v0, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v0, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ll9/c0;

    iget-object v8, p0, Lb9/x0;->x:Ljava/io/IOException;

    iget-boolean v9, p0, Lb9/x0;->y:Z

    invoke-virtual/range {v3 .. v9}, Lc9/h;->b(ILl9/c0;Ll9/t;Ll9/y;Ljava/io/IOException;Z)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

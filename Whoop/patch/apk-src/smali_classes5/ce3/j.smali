.class public final synthetic Lce3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Lkotlinx/serialization/internal/EnumDescriptor;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lce3/j;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lce3/j;->x:I

    iput-object p2, p0, Lce3/j;->y:Ljava/lang/Object;

    iput-object p3, p0, Lce3/j;->z:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lce3/q;ILce3/a;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lce3/j;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lce3/j;->y:Ljava/lang/Object;

    iput p2, p0, Lce3/j;->x:I

    iput-object p3, p0, Lce3/j;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lce3/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lce3/j;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lce3/j;->z:Ljava/lang/Object;

    check-cast v1, Lkotlinx/serialization/internal/EnumDescriptor;

    iget v2, p0, Lce3/j;->x:I

    invoke-static {v2, v0, v1}, Lkotlinx/serialization/internal/EnumDescriptor;->d(ILjava/lang/String;Lkotlinx/serialization/internal/EnumDescriptor;)[Lyc3/g;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lce3/j;->y:Ljava/lang/Object;

    check-cast v0, Lce3/q;

    iget v1, p0, Lce3/j;->x:I

    iget-object v2, p0, Lce3/j;->z:Ljava/lang/Object;

    check-cast v2, Lce3/a;

    :try_start_0
    iget-object v3, v0, Lce3/q;->X:Lce3/z;

    invoke-virtual {v3, v1, v2}, Lce3/z;->x(ILce3/a;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    sget-object v2, Lce3/a;->z:Lce3/a;

    invoke-virtual {v0, v2, v2, v1}, Lce3/q;->b(Lce3/a;Lce3/a;Ljava/io/IOException;)V

    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.class public final Lel/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldl/u;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lel/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ldl/z;)Ldl/t;
    .locals 3

    iget v0, p0, Lel/b;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ldl/b0;

    const-class v1, Ldl/i;

    const-class v2, Ljava/io/InputStream;

    invoke-virtual {p1, v1, v2}, Ldl/z;->b(Ljava/lang/Class;Ljava/lang/Class;)Ldl/t;

    move-result-object p1

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Ldl/b0;-><init>(Ldl/t;I)V

    return-object v0

    :pswitch_0
    new-instance v0, Lel/c;

    const-class v1, Ldl/i;

    const-class v2, Ljava/io/InputStream;

    invoke-virtual {p1, v1, v2}, Ldl/z;->b(Ljava/lang/Class;Ljava/lang/Class;)Ldl/t;

    move-result-object p1

    invoke-direct {v0, p1}, Lel/c;-><init>(Ldl/t;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

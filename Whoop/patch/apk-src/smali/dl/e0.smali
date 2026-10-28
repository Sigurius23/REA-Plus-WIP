.class public final Ldl/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldl/u;


# instance fields
.field public final synthetic a:I

.field public final b:Landroid/content/ContentResolver;


# direct methods
.method public synthetic constructor <init>(Landroid/content/ContentResolver;I)V
    .locals 0

    iput p2, p0, Ldl/e0;->a:I

    iput-object p1, p0, Ldl/e0;->b:Landroid/content/ContentResolver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ldl/z;)Ldl/t;
    .locals 0

    iget p1, p0, Ldl/e0;->a:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ldl/f0;

    invoke-direct {p1, p0}, Ldl/f0;-><init>(Ldl/e0;)V

    return-object p1

    :pswitch_0
    new-instance p1, Ldl/f0;

    invoke-direct {p1, p0}, Ldl/f0;-><init>(Ldl/e0;)V

    return-object p1

    :pswitch_1
    new-instance p1, Ldl/f0;

    invoke-direct {p1, p0}, Ldl/f0;-><init>(Ldl/e0;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

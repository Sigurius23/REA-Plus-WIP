.class public final Lxg3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxg3/b;


# static fields
.field public static final b:Lxg3/a;

.field public static final c:Lxg3/a;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lxg3/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lxg3/a;-><init>(I)V

    sput-object v0, Lxg3/a;->b:Lxg3/a;

    new-instance v0, Lxg3/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lxg3/a;-><init>(I)V

    sput-object v0, Lxg3/a;->c:Lxg3/a;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lxg3/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    iget v0, p0, Lxg3/a;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lrx/exceptions/MissingBackpressureException;

    const-string v1, "Overflowed buffer"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const/4 v0, 0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

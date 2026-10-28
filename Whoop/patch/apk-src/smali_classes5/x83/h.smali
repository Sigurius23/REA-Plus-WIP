.class public final Lx83/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxb3/i;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc93/a;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lx83/h;->a:I

    const-string v0, "getNextValue"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx83/h;->b:Ljava/lang/Object;

    iput-object p2, p0, Lx83/h;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Lx83/i;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lx83/h;->a:I

    const-string v0, "start"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lx83/h;->b:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lx83/h;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    iget v0, p0, Lx83/h;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lxb3/h;

    invoke-direct {v0, p0}, Lxb3/h;-><init>(Lx83/h;)V

    return-object v0

    :pswitch_0
    new-instance v0, Lx83/f;

    invoke-direct {v0, p0}, Lx83/f;-><init>(Lx83/h;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

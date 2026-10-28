.class public final Lvk/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldl/u;


# static fields
.field public static volatile c:Lud3/l0;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Lvk/b;->a:I

    packed-switch p1, :pswitch_data_0

    sget-object p1, Lvk/b;->c:Lud3/l0;

    if-nez p1, :cond_1

    const-class p1, Lvk/b;

    monitor-enter p1

    :try_start_0
    sget-object v0, Lvk/b;->c:Lud3/l0;

    if-nez v0, :cond_0

    new-instance v0, Lud3/l0;

    invoke-direct {v0}, Lud3/l0;-><init>()V

    sput-object v0, Lvk/b;->c:Lud3/l0;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p1

    goto :goto_2

    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_2
    sget-object p1, Lvk/b;->c:Lud3/l0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvk/b;->b:Ljava/lang/Object;

    return-void

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lad3/z;

    const/16 v0, 0x8

    invoke-direct {p1, v0}, Lad3/z;-><init>(I)V

    iput-object p1, p0, Lvk/b;->b:Ljava/lang/Object;

    return-void

    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ldl/e;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ldl/e;-><init>(I)V

    iput-object p1, p0, Lvk/b;->b:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(Ldl/z;)Ldl/t;
    .locals 2

    iget p1, p0, Lvk/b;->a:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lel/a;

    iget-object v0, p0, Lvk/b;->b:Ljava/lang/Object;

    check-cast v0, Lad3/z;

    invoke-direct {p1, v0}, Lel/a;-><init>(Lad3/z;)V

    return-object p1

    :pswitch_0
    new-instance p1, Ldl/d;

    iget-object v0, p0, Lvk/b;->b:Ljava/lang/Object;

    check-cast v0, Ldl/e;

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1}, Ldl/d;-><init>(Ljava/lang/Object;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Ldl/d;

    iget-object v0, p0, Lvk/b;->b:Ljava/lang/Object;

    check-cast v0, Lud3/i;

    const/4 v1, 0x3

    invoke-direct {p1, v0, v1}, Ldl/d;-><init>(Ljava/lang/Object;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

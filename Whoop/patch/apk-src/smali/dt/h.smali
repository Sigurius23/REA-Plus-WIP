.class public final Ldt/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgt/e;


# static fields
.field public static final E:Ldt/h;

.field public static final x:Ldt/h;

.field public static final y:Ldt/h;

.field public static final z:Ldt/h;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Ldt/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldt/h;-><init>(I)V

    sput-object v0, Ldt/h;->x:Ldt/h;

    new-instance v0, Ldt/h;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ldt/h;-><init>(I)V

    sput-object v0, Ldt/h;->y:Ldt/h;

    new-instance v0, Ldt/h;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ldt/h;-><init>(I)V

    sput-object v0, Ldt/h;->z:Ldt/h;

    new-instance v0, Ldt/h;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ldt/h;-><init>(I)V

    sput-object v0, Ldt/h;->E:Ldt/h;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ldt/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Laa3/i1;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Ldt/h;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lgt/p;

    const-class v1, Lft/d;

    const-class v2, Ljava/util/concurrent/Executor;

    invoke-direct {v0, v1, v2}, Lgt/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Laa3/i1;->h(Lgt/p;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "c.get(Qualified.qualifie\u2026a, Executor::class.java))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/concurrent/Executor;

    invoke-static {p1}, Lbc3/f0;->q(Ljava/util/concurrent/Executor;)Lbc3/z;

    move-result-object p1

    return-object p1

    :pswitch_0
    new-instance v0, Lgt/p;

    const-class v1, Lft/b;

    const-class v2, Ljava/util/concurrent/Executor;

    invoke-direct {v0, v1, v2}, Lgt/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Laa3/i1;->h(Lgt/p;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "c.get(Qualified.qualifie\u2026a, Executor::class.java))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/concurrent/Executor;

    invoke-static {p1}, Lbc3/f0;->q(Ljava/util/concurrent/Executor;)Lbc3/z;

    move-result-object p1

    return-object p1

    :pswitch_1
    new-instance v0, Lgt/p;

    const-class v1, Lft/c;

    const-class v2, Ljava/util/concurrent/Executor;

    invoke-direct {v0, v1, v2}, Lgt/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Laa3/i1;->h(Lgt/p;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "c.get(Qualified.qualifie\u2026a, Executor::class.java))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/concurrent/Executor;

    invoke-static {p1}, Lbc3/f0;->q(Ljava/util/concurrent/Executor;)Lbc3/z;

    move-result-object p1

    return-object p1

    :pswitch_2
    new-instance v0, Lgt/p;

    const-class v1, Lft/a;

    const-class v2, Ljava/util/concurrent/Executor;

    invoke-direct {v0, v1, v2}, Lgt/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Laa3/i1;->h(Lgt/p;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "c.get(Qualified.qualifie\u2026a, Executor::class.java))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/concurrent/Executor;

    invoke-static {p1}, Lbc3/f0;->q(Ljava/util/concurrent/Executor;)Lbc3/z;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

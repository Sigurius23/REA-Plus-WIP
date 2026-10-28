.class public Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-fcm"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lgt/p;Laa3/i1;)Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 0

    invoke-static {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;->lambda$getComponents$0(Lgt/p;Lgt/c;)Lcom/google/firebase/messaging/FirebaseMessaging;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Lgt/p;Lgt/c;)Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 7

    new-instance v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    const-class v1, Ldt/g;

    invoke-interface {p1, v1}, Lgt/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldt/g;

    const-class v2, Lrt/a;

    invoke-interface {p1, v2}, Lgt/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    const-class v2, Lbu/b;

    invoke-interface {p1, v2}, Lgt/c;->e(Ljava/lang/Class;)Lst/a;

    move-result-object v2

    const-class v3, Lqt/g;

    invoke-interface {p1, v3}, Lgt/c;->e(Ljava/lang/Class;)Lst/a;

    move-result-object v3

    const-class v4, Ltt/d;

    invoke-interface {p1, v4}, Lgt/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ltt/d;

    invoke-interface {p1, p0}, Lgt/c;->f(Lgt/p;)Lst/a;

    move-result-object v5

    const-class p0, Lpt/b;

    invoke-interface {p1, p0}, Lgt/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Lpt/b;

    invoke-direct/range {v0 .. v6}, Lcom/google/firebase/messaging/FirebaseMessaging;-><init>(Ldt/g;Lst/a;Lst/a;Ltt/d;Lst/a;Lpt/b;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/ClassCastException;

    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    throw p0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 7
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lgt/b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lgt/p;

    const-class v1, Ljt/b;

    const-class v2, Ldm/e;

    invoke-direct {v0, v1, v2}, Lgt/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    new-instance v1, Lgt/a;

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    const-class v4, Lcom/google/firebase/messaging/FirebaseMessaging;

    invoke-direct {v1, v4, v3}, Lgt/a;-><init>(Ljava/lang/Class;[Ljava/lang/Class;)V

    const-string v3, "fire-fcm"

    iput-object v3, v1, Lgt/a;->a:Ljava/lang/String;

    const-class v4, Ldt/g;

    invoke-static {v4}, Lgt/j;->a(Ljava/lang/Class;)Lgt/j;

    move-result-object v4

    invoke-virtual {v1, v4}, Lgt/a;->a(Lgt/j;)V

    new-instance v4, Lgt/j;

    const-class v5, Lrt/a;

    invoke-direct {v4, v2, v2, v5}, Lgt/j;-><init>(IILjava/lang/Class;)V

    invoke-virtual {v1, v4}, Lgt/a;->a(Lgt/j;)V

    new-instance v4, Lgt/j;

    const/4 v5, 0x1

    const-class v6, Lbu/b;

    invoke-direct {v4, v2, v5, v6}, Lgt/j;-><init>(IILjava/lang/Class;)V

    invoke-virtual {v1, v4}, Lgt/a;->a(Lgt/j;)V

    new-instance v4, Lgt/j;

    const-class v6, Lqt/g;

    invoke-direct {v4, v2, v5, v6}, Lgt/j;-><init>(IILjava/lang/Class;)V

    invoke-virtual {v1, v4}, Lgt/a;->a(Lgt/j;)V

    const-class v4, Ltt/d;

    invoke-static {v4}, Lgt/j;->a(Ljava/lang/Class;)Lgt/j;

    move-result-object v4

    invoke-virtual {v1, v4}, Lgt/a;->a(Lgt/j;)V

    new-instance v4, Lgt/j;

    invoke-direct {v4, v0, v2, v5}, Lgt/j;-><init>(Lgt/p;II)V

    invoke-virtual {v1, v4}, Lgt/a;->a(Lgt/j;)V

    const-class v4, Lpt/b;

    invoke-static {v4}, Lgt/j;->a(Ljava/lang/Class;)Lgt/j;

    move-result-object v4

    invoke-virtual {v1, v4}, Lgt/a;->a(Lgt/j;)V

    new-instance v4, Lqt/b;

    const/4 v6, 0x1

    invoke-direct {v4, v0, v6}, Lqt/b;-><init>(Lgt/p;I)V

    iput-object v4, v1, Lgt/a;->f:Lgt/e;

    iget v0, v1, Lgt/a;->d:I

    if-nez v0, :cond_0

    move v2, v5

    :cond_0
    if-eqz v2, :cond_1

    iput v5, v1, Lgt/a;->d:I

    invoke-virtual {v1}, Lgt/a;->b()Lgt/b;

    move-result-object v0

    const-string v1, "24.0.0"

    invoke-static {v3, v1}, Ljc/x;->y(Ljava/lang/String;Ljava/lang/String;)Lgt/b;

    move-result-object v1

    filled-new-array {v0, v1}, [Lgt/b;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Instantiation type has already been set."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

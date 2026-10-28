.class public Lcom/google/firebase/FirebaseCommonRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/16 v0, 0x20

    const/16 v1, 0x5f

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x2f

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getComponents()Ljava/util/List;
    .locals 15

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Class;

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    new-instance v12, Ljava/util/HashSet;

    invoke-direct {v12}, Ljava/util/HashSet;-><init>()V

    const-class v13, Lbu/b;

    invoke-static {v13}, Lgt/p;->a(Ljava/lang/Class;)Lgt/p;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    array-length v5, v2

    const/4 v9, 0x0

    move v6, v9

    :goto_0
    if-ge v6, v5, :cond_0

    aget-object v7, v2, v6

    const-string v8, "Null interface"

    invoke-static {v7, v8}, Lts/o;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7}, Lgt/p;->a(Ljava/lang/Class;)Lgt/p;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_0
    new-instance v2, Lgt/j;

    const/4 v14, 0x2

    const-class v5, Lbu/a;

    invoke-direct {v2, v14, v1, v5}, Lgt/j;-><init>(IILjava/lang/Class;)V

    iget-object v5, v2, Lgt/j;->a:Lgt/p;

    invoke-virtual {v3, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {v4, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v11, Lb23/h;

    const/4 v2, 0x2

    invoke-direct {v11, v2}, Lb23/h;-><init>(I)V

    new-instance v5, Lgt/b;

    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    const/4 v6, 0x0

    move v10, v9

    invoke-direct/range {v5 .. v12}, Lgt/b;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILgt/e;Ljava/util/Set;)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lgt/p;

    const-class v3, Lft/a;

    const-class v4, Ljava/util/concurrent/Executor;

    invoke-direct {v2, v3, v4}, Lgt/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    const-class v3, Lqt/f;

    const-class v4, Lqt/g;

    filled-new-array {v3, v4}, [Ljava/lang/Class;

    move-result-object v3

    new-instance v4, Lgt/a;

    const-class v5, Lqt/d;

    invoke-direct {v4, v5, v3}, Lgt/a;-><init>(Ljava/lang/Class;[Ljava/lang/Class;)V

    const-class v3, Landroid/content/Context;

    invoke-static {v3}, Lgt/j;->a(Ljava/lang/Class;)Lgt/j;

    move-result-object v3

    invoke-virtual {v4, v3}, Lgt/a;->a(Lgt/j;)V

    const-class v3, Ldt/g;

    invoke-static {v3}, Lgt/j;->a(Ljava/lang/Class;)Lgt/j;

    move-result-object v3

    invoke-virtual {v4, v3}, Lgt/a;->a(Lgt/j;)V

    new-instance v3, Lgt/j;

    const-class v5, Lqt/e;

    invoke-direct {v3, v14, v1, v5}, Lgt/j;-><init>(IILjava/lang/Class;)V

    invoke-virtual {v4, v3}, Lgt/a;->a(Lgt/j;)V

    new-instance v3, Lgt/j;

    const/4 v5, 0x1

    invoke-direct {v3, v5, v5, v13}, Lgt/j;-><init>(IILjava/lang/Class;)V

    invoke-virtual {v4, v3}, Lgt/a;->a(Lgt/j;)V

    new-instance v3, Lgt/j;

    invoke-direct {v3, v2, v5, v1}, Lgt/j;-><init>(Lgt/p;II)V

    invoke-virtual {v4, v3}, Lgt/a;->a(Lgt/j;)V

    new-instance v1, Lqt/b;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lqt/b;-><init>(Lgt/p;I)V

    iput-object v1, v4, Lgt/a;->f:Lgt/e;

    invoke-virtual {v4}, Lgt/a;->b()Lgt/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "fire-android"

    invoke-static {v2, v1}, Ljc/x;->y(Ljava/lang/String;Ljava/lang/String;)Lgt/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "fire-core"

    const-string v2, "21.0.0"

    invoke-static {v1, v2}, Ljc/x;->y(Ljava/lang/String;Ljava/lang/String;)Lgt/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    invoke-static {v1}, Lcom/google/firebase/FirebaseCommonRegistrar;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "device-name"

    invoke-static {v2, v1}, Ljc/x;->y(Ljava/lang/String;Ljava/lang/String;)Lgt/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-static {v1}, Lcom/google/firebase/FirebaseCommonRegistrar;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "device-model"

    invoke-static {v2, v1}, Ljc/x;->y(Ljava/lang/String;Ljava/lang/String;)Lgt/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-static {v1}, Lcom/google/firebase/FirebaseCommonRegistrar;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "device-brand"

    invoke-static {v2, v1}, Ljc/x;->y(Ljava/lang/String;Ljava/lang/String;)Lgt/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lb23/h;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Lb23/h;-><init>(I)V

    const-string v2, "android-target-sdk"

    invoke-static {v2, v1}, Ljc/x;->I(Ljava/lang/String;Lb23/h;)Lgt/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lb23/h;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Lb23/h;-><init>(I)V

    const-string v2, "android-min-sdk"

    invoke-static {v2, v1}, Ljc/x;->I(Ljava/lang/String;Lb23/h;)Lgt/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lb23/h;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Lb23/h;-><init>(I)V

    const-string v2, "android-platform"

    invoke-static {v2, v1}, Ljc/x;->I(Ljava/lang/String;Lb23/h;)Lgt/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lb23/h;

    const/16 v2, 0x9

    invoke-direct {v1, v2}, Lb23/h;-><init>(I)V

    const-string v2, "android-installer"

    invoke-static {v2, v1}, Ljc/x;->I(Ljava/lang/String;Lb23/h;)Lgt/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :try_start_0
    sget-object v1, Ll83/g;->z:Ll83/g;

    invoke-virtual {v1}, Ll83/g;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_1

    const-string v2, "kotlin"

    invoke-static {v2, v1}, Ljc/x;->y(Ljava/lang/String;Ljava/lang/String;)Lgt/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Components are not allowed to depend on interfaces they themselves provide."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

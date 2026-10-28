.class public final Lm/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpb/c;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lm/m;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lm/k;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm/k;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lpb/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lm/k;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lm/k;->b:Ljava/lang/Object;

    .line 3
    const-string v0, "androidx.savedstate.Restarter"

    invoke-virtual {p1, v0, p0}, Lpb/d;->c(Ljava/lang/String;Lpb/c;)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 3

    iget v0, p0, Lm/k;->a:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    new-array v1, v0, [Ll83/k;

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll83/k;

    invoke-static {v0}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object v0

    iget-object v1, p0, Lm/k;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/LinkedHashSet;

    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    instance-of v2, v1, Ljava/util/ArrayList;

    if-eqz v2, :cond_0

    check-cast v1, Ljava/util/ArrayList;

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object v1, v2

    :goto_0
    const-string v2, "classes_to_restore"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-object v0

    :pswitch_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lm/k;->b:Ljava/lang/Object;

    check-cast v1, Lm/m;

    invoke-virtual {v1}, Lm/m;->getDelegate()Lm/q;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

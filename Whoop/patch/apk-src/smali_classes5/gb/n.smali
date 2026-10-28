.class public final synthetic Lgb/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e0;


# instance fields
.field public final synthetic w:Z

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:Leb/q;


# direct methods
.method public synthetic constructor <init>(Leb/q;Ljava/util/List;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p3, p0, Lgb/n;->w:Z

    iput-object p2, p0, Lgb/n;->x:Ljava/util/List;

    iput-object p1, p0, Lgb/n;->y:Leb/q;

    return-void
.end method


# virtual methods
.method public final h(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 2

    iget-boolean p1, p0, Lgb/n;->w:Z

    iget-object v0, p0, Lgb/n;->x:Ljava/util/List;

    iget-object v1, p0, Lgb/n;->y:Leb/q;

    if-eqz p1, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    sget-object p1, Landroidx/lifecycle/v;->ON_START:Landroidx/lifecycle/v;

    if-ne p2, p1, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    sget-object p1, Landroidx/lifecycle/v;->ON_STOP:Landroidx/lifecycle/v;

    if-ne p2, p1, :cond_2

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method

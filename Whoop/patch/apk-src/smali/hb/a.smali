.class public final synthetic Lhb/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/fragment/app/u1;


# instance fields
.field public final synthetic w:Lhb/d;


# direct methods
.method public synthetic constructor <init>(Lhb/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb/a;->w:Lhb/d;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/fragment/app/o1;Landroidx/fragment/app/m0;)V
    .locals 2

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lhb/a;->w:Lhb/d;

    iget-object v0, p1, Lhb/d;->e:Ljava/util/LinkedHashSet;

    invoke-virtual {p2}, Landroidx/fragment/app/m0;->getTag()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lkotlin/jvm/internal/m0;->a(Ljava/util/AbstractCollection;)Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Landroidx/fragment/app/m0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v0

    iget-object v1, p1, Lhb/d;->f:Lpb/a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    :cond_0
    iget-object p1, p1, Lhb/d;->g:Ljava/util/LinkedHashMap;

    invoke-virtual {p2}, Landroidx/fragment/app/m0;->getTag()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1}, Lkotlin/jvm/internal/m0;->c(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

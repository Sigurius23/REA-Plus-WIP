.class public final Lmq0/a;
.super Landroidx/recyclerview/widget/i1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/i1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J1\u0010\u001d\u001a\u00020\u00072\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00172\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u001fR \u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010 R\u001c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010!R$\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lmq0/a;",
        "Landroidx/recyclerview/widget/i1;",
        "Lmq0/b;",
        "Lcom/whoop/data/local/prefs/PreferenceHelper;",
        "preferenceHelper",
        "Lkotlin/Function1;",
        "Liq0/t;",
        "Ll83/a0;",
        "widgetOnClickListener",
        "<init>",
        "(Lcom/whoop/data/local/prefs/PreferenceHelper;Lkotlin/jvm/functions/Function1;)V",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "b",
        "(Landroid/view/ViewGroup;I)Lmq0/b;",
        "getItemCount",
        "()I",
        "holderDataWidget",
        "position",
        "a",
        "(Lmq0/b;I)V",
        "",
        "Lbq0/b;",
        "dataWidgets",
        "Ll83/k;",
        "",
        "authHeader",
        "c",
        "(Ljava/util/List;Ll83/k;)V",
        "Lcom/whoop/data/local/prefs/PreferenceHelper;",
        "Lkotlin/jvm/functions/Function1;",
        "Ljava/util/List;",
        "d",
        "Ll83/k;",
        "community_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lcom/whoop/data/local/prefs/PreferenceHelper;

.field private final b:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lbq0/b;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ll83/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/k;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/data/local/prefs/PreferenceHelper;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/local/prefs/PreferenceHelper;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "preferenceHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "widgetOnClickListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/recyclerview/widget/i1;-><init>()V

    iput-object p1, p0, Lmq0/a;->a:Lcom/whoop/data/local/prefs/PreferenceHelper;

    iput-object p2, p0, Lmq0/a;->b:Lkotlin/jvm/functions/Function1;

    sget-object p1, Lm83/y;->w:Lm83/y;

    iput-object p1, p0, Lmq0/a;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(Lmq0/b;I)V
    .locals 2

    const-string v0, "holderDataWidget"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lmq0/a;->c:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lbq0/b;

    iget-object v0, p0, Lmq0/a;->d:Ll83/k;

    iget-object v1, p0, Lmq0/a;->a:Lcom/whoop/data/local/prefs/PreferenceHelper;

    invoke-virtual {p1, p2, v0, v1}, Lmq0/b;->a(Lbq0/b;Ll83/k;Lcom/whoop/data/local/prefs/PreferenceHelper;)V

    return-void
.end method

.method public b(Landroid/view/ViewGroup;I)Lmq0/b;
    .locals 2

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lmq0/b;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Leq0/m;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Leq0/m;

    move-result-object p1

    const-string v0, "inflate(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lmq0/a;->b:Lkotlin/jvm/functions/Function1;

    invoke-direct {p2, p1, v0}, Lmq0/b;-><init>(Leq0/m;Lkotlin/jvm/functions/Function1;)V

    return-object p2
.end method

.method public final c(Ljava/util/List;Ll83/k;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lbq0/b;",
            ">;",
            "Ll83/k;",
            ")V"
        }
    .end annotation

    const-string v0, "dataWidgets"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lmq0/a;->c:Ljava/util/List;

    iput-object p2, p0, Lmq0/a;->d:Ll83/k;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/i1;->notifyDataSetChanged()V

    return-void
.end method

.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Lmq0/a;->c:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 0

    check-cast p1, Lmq0/b;

    invoke-virtual {p0, p1, p2}, Lmq0/a;->a(Lmq0/b;I)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lmq0/a;->b(Landroid/view/ViewGroup;I)Lmq0/b;

    move-result-object p1

    return-object p1
.end method

.class public final Lpq0/j;
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
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J1\u0010\u001a\u001a\u00020\u000f2\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\t\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001fR\u001c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010 R$\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Lpq0/j;",
        "Landroidx/recyclerview/widget/i1;",
        "Lpq0/k;",
        "Lcom/whoop/data/local/prefs/PreferenceHelper;",
        "preferenceHelper",
        "<init>",
        "(Lcom/whoop/data/local/prefs/PreferenceHelper;)V",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "c",
        "(Landroid/view/ViewGroup;I)Lpq0/k;",
        "holder",
        "position",
        "Ll83/a0;",
        "b",
        "(Lpq0/k;I)V",
        "getItemCount",
        "()I",
        "",
        "Lcom/whoop/domain/model/teams/Widget;",
        "globalWidgets",
        "Ll83/k;",
        "",
        "authHeader",
        "d",
        "(Ljava/util/List;Ll83/k;)V",
        "page",
        "a",
        "(I)Ljava/lang/String;",
        "Lcom/whoop/data/local/prefs/PreferenceHelper;",
        "Ljava/util/List;",
        "widgets",
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

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/Widget;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ll83/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/k;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/data/local/prefs/PreferenceHelper;)V
    .locals 1

    const-string v0, "preferenceHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/recyclerview/widget/i1;-><init>()V

    iput-object p1, p0, Lpq0/j;->a:Lcom/whoop/data/local/prefs/PreferenceHelper;

    sget-object p1, Lm83/y;->w:Lm83/y;

    iput-object p1, p0, Lpq0/j;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpq0/j;->b:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lpq0/j;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/domain/model/teams/Widget;

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/Widget;->getCollection()Lcom/whoop/community/share/WidgetCollectionName;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, ""

    return-object p1
.end method

.method public b(Lpq0/k;I)V
    .locals 2

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpq0/j;->b:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/domain/model/teams/Widget;

    iget-object v0, p0, Lpq0/j;->c:Ll83/k;

    iget-object v1, p0, Lpq0/j;->a:Lcom/whoop/data/local/prefs/PreferenceHelper;

    invoke-virtual {p1, p2, v0, v1}, Lpq0/k;->a(Lcom/whoop/domain/model/teams/Widget;Ll83/k;Lcom/whoop/data/local/prefs/PreferenceHelper;)V

    return-void
.end method

.method public c(Landroid/view/ViewGroup;I)Lpq0/k;
    .locals 2

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lpq0/k;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Leq0/u3;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Leq0/u3;

    move-result-object p1

    const-string v0, "inflate(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p1}, Lpq0/k;-><init>(Leq0/u3;)V

    return-object p2
.end method

.method public final d(Ljava/util/List;Ll83/k;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/Widget;",
            ">;",
            "Ll83/k;",
            ")V"
        }
    .end annotation

    const-string v0, "globalWidgets"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpq0/j;->b:Ljava/util/List;

    iput-object p2, p0, Lpq0/j;->c:Ll83/k;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/i1;->notifyDataSetChanged()V

    return-void
.end method

.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Lpq0/j;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 0

    check-cast p1, Lpq0/k;

    invoke-virtual {p0, p1, p2}, Lpq0/j;->b(Lpq0/k;I)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lpq0/j;->c(Landroid/view/ViewGroup;I)Lpq0/k;

    move-result-object p1

    return-object p1
.end method
